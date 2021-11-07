public class dentist extends employee{
    private double NOEx;
    public roles role;

    public dentist(){}

    public dentist(int _id, String _name, int NOE, int _mob, String _dob, String _nic){
        this.eID=_id;
        this.eName=_name;
        this.Mob=_mob;
        this.NIC=_nic;
        this.DOB=_dob;
        this.NOEx=NOE;
    }

    @Override
    public void add(employee _obj) {
        dB.employeeList.add(this);

    }

    @Override
    void display() {
        
    }

    public void setRole(roles _role) {  
        this.role = _role; }

    public void addWithInput(){
        com.print("\n");
        this.eID = com.intConvert(com.getInputData("Enter the ID: "));
        this.eName = com.getInputData("Enter the Name: ");
        this.Mob = com.intConvert(com.getInputData("Enter the Mobile number: "));
        this.DOB = com.getInputData("Enter the Date of Birth: ");
        this.NIC = com.getInputData("Enter the NIC number: ");
        this.NOEx = com.intConvert("Enter the Number of Experience: ");
        dB.employeeList.add(this);

    }

	public void showDetail() {
        System.out.println("");
        System.out.println("ID : " + this.eID);
        System.out.println("Name :" + this.eName);
        System.out.println("DOB :" + this.DOB);
        System.out.println("NIC :" + this.NIC);
        System.out.println("Mob :" + this.Mob);
        System.out.println("Experience :" + this.NOEx);
        System.out.print("Role :");
        role.displayDetail();
        System.out.println("");
	}
}