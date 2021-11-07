public class Persona {
    protected int pID,Mob;
    protected String pName,address,NIC,DOB;

    public Persona(int _id,String _name,String _address, int _mob, String _nic, String _dob ){

        this.pID=_id;
        this.pName=_name;
        this.address=_address;
        this.Mob=_mob;
        this.NIC=_nic;
    }

    static String getChoice = null;

    public static void menu(){
        com.print("Room - RS\n-----------------");
        com.print("1 - Add ");
        com.print("2 - Display ");

        com.print_input("What is your choice ? ");
        getChoice = com.getInput();

        switch (getChoice) {
            case "1":
            
                break;

            case "2":
                
                break;

        }
    }
    
}