public class dashBoard {
    static String getChoice = null;

    public dashBoard() {
        myDashBoard();
    }

    public static void myDashBoard() {
        com.print("Hospital - RS\n-----------------");
        com.print("1 - Employee ");
        com.print("2 - Patients ");
        com.print("3 - Appointment ");
        com.print("4 - Persona ");
        com.print("5 - Treatment Fee ");
        com.print("6 - Payment ");
        com.print("7 - Room ");
        com.print("8 - Logout ");

        com.print_input("What is your choice ? ");
        getChoice = com.getInput();

        switch (getChoice) {
            case "1":
                employee.menu();
                break;

            case "2":
                patients.menu();
                break;

            case "3":
                appointment.menu();        
                break;

            case "4":
                Persona.menu();
                break;

            case "5":
                treatmentFee.menu();
                break;

            case "6":
                payment.menu();
                break;

            case "7":
                Room.menu();
                break;

            case "8":
                com.print("bye..!");
                break;

        }

    }
}