import pygame
import random
import sys

# Grid settings
GRID_SIZE = 6
CELL_SIZE = 100
WINDOW_SIZE = GRID_SIZE * CELL_SIZE

# Colors
WHITE = (240, 240, 240)
BLACK = (0, 0, 0)
DIRTY = (139, 69, 19)  # Dirt = brown
CLEAN = (255, 255, 255)
VACUUM_COLOR = (70, 130, 180)  # Steel blue

# Initialize Pygame
pygame.init()
win = pygame.display.set_mode((WINDOW_SIZE, WINDOW_SIZE + 60))  # Extra space for score
pygame.display.set_caption("Vacuum Cleaner Simulation")

font = pygame.font.SysFont("Arial", 28)

# Environment: Each cell is either "Clean" or "Dirty"
environment = [["Dirty" if random.random() < 0.5 else "Clean" for _ in range(GRID_SIZE)] for _ in range(GRID_SIZE)]

# Vacuum initial position
vacuum_x, vacuum_y = random.randint(0, GRID_SIZE - 1), random.randint(0, GRID_SIZE - 1)

# Score
score = 0
steps = 0


def draw_environment():
    win.fill(WHITE)

    # Draw grid
    for y in range(GRID_SIZE):
        for x in range(GRID_SIZE):
            rect = pygame.Rect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE)
            if environment[y][x] == "Dirty":
                pygame.draw.rect(win, DIRTY, rect)  # Dirty cell
            else:
                pygame.draw.rect(win, CLEAN, rect)  # Clean cell
            pygame.draw.rect(win, BLACK, rect, 2)  # Grid lines

    # Draw vacuum cleaner
    vacuum_rect = pygame.Rect(vacuum_x * CELL_SIZE + 20, vacuum_y * CELL_SIZE + 20, CELL_SIZE - 40, CELL_SIZE - 40)
    pygame.draw.ellipse(win, VACUUM_COLOR, vacuum_rect)

    # Draw score bar
    pygame.draw.rect(win, BLACK, (0, WINDOW_SIZE, WINDOW_SIZE, 60))
    score_text = font.render(f"Score: {score}   Steps: {steps}", True, WHITE)
    win.blit(score_text, (20, WINDOW_SIZE + 15))


def move_vacuum():
    global vacuum_x, vacuum_y, score

    # Clean if dirty
    if environment[vacuum_y][vacuum_x] == "Dirty":
        environment[vacuum_y][vacuum_x] = "Clean"
        score += 1

    # Possible moves
    moves = []
    if vacuum_x > 0:
        moves.append((-1, 0))
    if vacuum_x < GRID_SIZE - 1:
        moves.append((1, 0))
    if vacuum_y > 0:
        moves.append((0, -1))
    if vacuum_y < GRID_SIZE - 1:
        moves.append((0, 1))

    dx, dy = random.choice(moves)
    vacuum_x += dx
    vacuum_y += dy


def all_clean():
    return all(cell == "Clean" for row in environment for cell in row)


# Main loop
clock = pygame.time.Clock()
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

    if not all_clean():
        steps += 1
        move_vacuum()
    else:
        # Display final message
        win.fill(BLACK)
        msg = font.render(f"All Cleaned! Score: {score} in {steps} steps", True, WHITE)
        win.blit(msg, (50, WINDOW_SIZE // 2))
        pygame.display.update()
        pygame.time.wait(3000)
        pygame.quit()
        sys.exit()

    draw_environment()
    pygame.display.update()
    clock.tick(3)  # Speed: 3 steps per second

