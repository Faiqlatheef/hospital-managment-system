/**
 * scanningList
 */
public class scanningList extends Queue {

    public scanningList(int size) {
        super(size);
    }

    @Override
    public void search(int id) {
        boolean status = false;
        for (Patients obj : myList) {
            if (obj != null) {
                if (id == obj.id) {
                    status = true;
                    break;
                }
            }

        }

        if (status) {
            System.out.println("The searching patient is found...");
        } else {
            System.out.println("The searching patient not is found...");
        }

    }

    @Override
    public void showAll() {
        for (Patients obj : myList) {

            if (obj != null) {

                System.out.println("ID : " + obj.id);
                System.out.println("Name : " + obj.name);
                System.out.println("");
            }

        }

    }

}