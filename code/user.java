public class user extends employee{
    String username,password;

    public user (){}

    public user(int _id, String _name, int _mob, String _dob, String _nic, String _username, String _password){
        this.eID=_id;
        this.eName=_name;
        this.Mob=_mob;
        this.NIC=_nic;
        this.DOB=_dob;
        this.username= _username;
        this.password=_password;

    }

    @Override
    public void add(employee _obj) {
        dB.employeeList.add(this);

    }

    @Override
    void display() {
        
    }
    
    public void addWithInput(){
        com.print("\n");
        this.eID = com.intConvert(com.getInputData("Enter the ID: "));
        this.eName = com.getInputData("Enter the Name: ");
        this.Mob = com.intConvert(com.getInputData("Enter the Mobile number: "));
        this.DOB = com.getInputData("Enter the Date of Birth: ");
        this.NIC = com.getInputData("Enter the NIC number: ");
        this.username = com.getInputData("Enter the Username: ");
        this.password = com.getInputData("Enter the Password: ");
        dB.employeeList.add(this);

    }

}