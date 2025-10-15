import pygame
import random
import sys

# Grid settings
GRID_SIZE = 6
CELL_SIZE = 100
WINDOW_SIZE = GRID_SIZE * CELL_SIZE

# Initialize Pygame
pygame.init()
win = pygame.display.set_mode((WINDOW_SIZE, WINDOW_SIZE + 80))
pygame.display.set_caption("Vacuum Cleaner Game")

font = pygame.font.SysFont("Arial", 28)

# Load images
vacuum_img = pygame.image.load("vacuum.png")
dirt_img = pygame.image.load("dirt.png")
floor_img = pygame.image.load("floor.png")

# Scale images to fit grid
vacuum_img = pygame.transform.scale(vacuum_img, (CELL_SIZE - 30, CELL_SIZE - 30))
dirt_img = pygame.transform.scale(dirt_img, (CELL_SIZE - 20, CELL_SIZE - 20))
floor_img = pygame.transform.scale(floor_img, (CELL_SIZE, CELL_SIZE))

# Environment: Each cell is either "Clean" or "Dirty"
environment = [["Dirty" if random.random() < 0.5 else "Clean" for _ in range(GRID_SIZE)] for _ in range(GRID_SIZE)]

# Vacuum initial position
vacuum_x, vacuum_y = random.randint(0, GRID_SIZE - 1), random.randint(0, GRID_SIZE - 1)

# Score
score = 0
steps = 0


def draw_environment():
    win.fill((50, 50, 50))

    # Draw floor and dirt
    for y in range(GRID_SIZE):
        for x in range(GRID_SIZE):
            rect = pygame.Rect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE)

            # Floor tile
            win.blit(floor_img, rect)

            # Dirt pile if dirty
            if environment[y][x] == "Dirty":
                win.blit(dirt_img, (x * CELL_SIZE + 10, y * CELL_SIZE + 10))

            # Grid lines
            pygame.draw.rect(win, (0, 0, 0), rect, 2)

    # Draw vacuum cleaner
    win.blit(vacuum_img, (vacuum_x * CELL_SIZE + 15, vacuum_y * CELL_SIZE + 15))

    # Draw score bar
    pygame.draw.rect(win, (30, 30, 30), (0, WINDOW_SIZE, WINDOW_SIZE, 80))
    score_text = font.render(f"Score: {score}   Steps: {steps}", True, (255, 255, 255))
    win.blit(score_text, (20, WINDOW_SIZE + 20))


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
        win.fill((0, 0, 0))
        msg = font.render(f"🎉 All Cleaned! Score: {score} in {steps} steps", True, (255, 255, 255))
        win.blit(msg, (50, WINDOW_SIZE // 2))
        pygame.display.update()
        pygame.time.wait(4000)
        pygame.quit()
        sys.exit()

    draw_environment()
    pygame.display.update()
    clock.tick(3)  # Speed
