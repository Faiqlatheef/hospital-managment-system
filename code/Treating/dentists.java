/**
 * dentists
 */
public class dentists {
    public String name, email, address;
    public int mob;
    public roles role;

    public dentists(String _name, String _email, int _mob, String _address) {
        this.name = _name;
        this.email = _email;
        this.mob = _mob;
        this.address = _address;
    }

    public void setRole(roles _role) {
        this.role = _role;
    }

    public void showDetail() {
        System.out.println("Name :" + this.name);
        System.out.println("Email : " + this.email);
        System.out.println("Mobile : " + String.valueOf(this.mob));
        System.out.println("Address : " + this.address);
        System.out.print("Role : ");
        role.displayDetail();
    }
}