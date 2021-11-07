public class Room {
    static String getChoice = null;
    private int rID;
    private String rName;
    private String rRoomNumber;
    private employee doctor;

    public Room(int id, String name, String RoomNumber, employee Doctor) {
        this.rID = id;
        this.rName = name;
        this.rRoomNumber = RoomNumber;
        this.doctor = Doctor;

    }

    public Room()
    {

    }

    public void add() {
        dB.roomList.add(this);
    }

    public static void addbyinput(){
        int _id = com.intConvert(com.getInputData("Enter the ID: "));
        String rName = com.getInputData("Enter the Name: ");
        String rRoomNumber = com.getInputData("Enter the Room Number: ");
        String doctor = com.getInputData("Enter the doctor: ");
        new Room().add();
    }

    public void display() {
        System.out.println("");
        System.out.println("ID : " + this.rID);
        System.out.println("Name : " + this.rName);
        System.out.println("Room Number : " + this.rRoomNumber);
        System.out.println("Doctor ID :" + doctor.eID);
        System.out.println("Doctor Name :" + doctor.eName);
        System.out.println("");
    }

    public static void displayAll(){
        for (Room row : dB.roomList) {
            row.display();
        }
    }

    public static void menu() {
        com.print("Room - RS\n-----------------");
        com.print("1 - Add ");
        com.print("2 - Display ");

        com.print_input("What is your choice ? ");
        getChoice = com.getInput();

        

        switch (getChoice) {
            case "1":
                addbyinput();
                break;

            case "2":
                displayAll();
                break;

        }
    }


}