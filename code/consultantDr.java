import java.sql.Date;
public class consultantDr extends employee {
    private double PGQualification;

    public consultantDr() {
    }

    public consultantDr(int _id, String _name, int PGD, int _mob, String _dob, String _nic) {
        this.eID=_id;
        this.eName=_name;
        this.Mob=_mob;
        this.NIC=_nic;
        this.DOB= _dob;
        this.PGQualification=PGD;
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
        this.PGQualification = com.intConvert("Enter the Number of Experience: ");
        dB.employeeList.add(this);

    }
}