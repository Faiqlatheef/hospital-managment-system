/**
 * scanMachine
 */
public class scanMachine {
    int serialNumber, cost;
    String make, country, origin;

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    private static scanMachine instance = new scanMachine();

    private scanMachine() {
    }

    public static scanMachine getInstance() {
        return instance;
    }

    public void displayDetail() {
        System.out.println("");
        System.out.println("Serial Number : " + this.serialNumber);
        System.out.println("Make : " + this.make);
        System.out.println("Country : " + this.country);
        System.out.println("Origin : " + this.origin);
        System.out.println("Cost : " + this.cost);
    }

}