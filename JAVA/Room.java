class Room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    void setData(int no, String type, double area, boolean ac) {
        roomno = no;
        roomtype = type;
        roomarea = area;
        ACmachine = ac;
    }

    void displayData() {
        System.out.println("Room No: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area: " + roomarea + " sq.ft");
        System.out.println("AC Available: " + (ACmachine ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Room r = new Room();
        r.setData(101, "Deluxe", 350.75, true);
        r.displayData();
    }
}
