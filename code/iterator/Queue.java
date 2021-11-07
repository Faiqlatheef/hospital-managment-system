/**
 * Queue
 */
public abstract class Queue implements QueueInterface {

    int top, size;
    Patients[] myList;

    public Queue(int _size) {
        this.size = _size;
        this.myList = new Patients[this.size];
        this.top = -1;
    }

    public void enque(Patients _Patients) {
        this.top += 1;
        myList[this.top] = _Patients;
    }

    public Patients deque() {
        Patients temp = this.myList[this.top];
        this.top -= 1;
        return temp;
    }

    public abstract void search(int id);

    public abstract void showAll();
}