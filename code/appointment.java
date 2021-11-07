public class appointment {
    private int id;
    private employee Doctor;
    private patients _Patients;
    private String aDateTime;
    static String getChoice = null;
    
    public appointment (int _id, employee _dr, int _room, String _dt, patients _Patients){
        this.id=_id;
        this.Doctor=_dr;
        this.aDateTime=_dt;
        this._Patients=_Patients;
    }


    public void display() {
        System.out.println("");
        System.out.println("ID : " + this.id);
        System.out.println("Date : " + this.Doctor);
        System.out.println("patients : " + _Patients.getPt_id());
        System.out.println("Doctor ID :" + Doctor.eID);
        System.out.println("");
    }

    public static void displayAll(){
        for (appointment row : dB.appointmentList) {
            row.display();
        }
    }

    
    public static void menu() {
        
        com.print("Appointment - RS\n-----------------");
        com.print("1 - Display ");

        com.print_input("What is your choice ? ");
        getChoice = com.getInput();


        switch (getChoice) {
            case "1":
            displayAll();
                break;

            case "2":
                
                break;

        }
    
    }

}
