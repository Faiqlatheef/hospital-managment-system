import java.sql.*;
public class nurse extends employee {
    int NOEx;

    public nurse(){}

    public nurse(int _id, String _name, int NOE, int _mob, String _dob, String _nic){
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

    public void addWithInput(){
        com.print("\n");
        this.eID = com.intConvert(com.getInputData("Enter the ID: "));
        this.eName = com.getInputData("Enter the Name: ");
        this.Mob = com.intConvert(com.getInputData("Enter the Mobile number: "));
        this.DOB = com.getInputData(com.getInputData("Enter the Date of Birth: "));
        this.NIC = com.getInputData("Enter the NIC number: ");
        this.NOEx = com.intConvert("Enter the Number of Experience: ");
        dB.employeeList.add(this);

    }
    
}