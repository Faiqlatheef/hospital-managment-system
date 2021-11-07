/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        scanningList obj = getList.getScanningList(5);
        obj.enque(new Patients(1, "p - 1","Male",9485272,077)); 
        obj.enque(new Patients(2, "p - 2","Female",9589256,075)); 
        obj.enque(new Patients(3, "p - 3","Female",90258336,077)); 
        obj.enque(new Patients(4, "p - 4","Male",9485632,076));

        obj.search(3);
        obj.search(14);

        obj.deque();

        obj.showAll();
    }
}