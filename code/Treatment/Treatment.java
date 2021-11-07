import java.util.ArrayList;
import java.util.List;

/**
 * Treatment
 */
public class Treatment {

    private int id;
    private String name;
    private List<Treatment> subordinates;

    public Treatment(int _id, String _name) {
        this.id = _id;
        this.name = _name;
        subordinates = new ArrayList<Treatment>();
    }

    public void addSubordinatesTreatment(Treatment _Treatment) {
        subordinates.add(_Treatment);
    }

    public void removeSubordinatesTreatment(Treatment _Treatment) {
        subordinates.remove(_Treatment);
    }

    public List<Treatment> getSubordinates() {
        return subordinates;
    }

    public void displayDetail() {
        System.out.println("Treatment - ID : " + this.id + ", Name : " + this.name);
    }

}