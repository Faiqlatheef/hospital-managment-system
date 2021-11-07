/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        dentists obj = new dentists("Doctor - A", "doc@gmail.com", 762615734, "Colombo");
        obj.setRole(new Treating());
        obj.showDetail();
    }
}