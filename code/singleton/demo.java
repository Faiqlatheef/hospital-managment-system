/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        // First Object
        scanMachine obj = scanMachine.getInstance();
        obj.setSerialNumber(2546);
        obj.setMake("SL");
        obj.setOrigin("Japan");
        obj.setCountry("Sri Lanka");
        obj.setCost(45826475);

        // Second Object
        scanMachine obj2 = scanMachine.getInstance();
        obj2.setSerialNumber(111);
        obj2.setMake("Ru");
        obj2.setOrigin("Japan");
        obj2.setCountry("Russia");
        obj2.setCost(50000000);

        // both object instance are calling display Detail Function
        // by passing different pararameters
        obj.displayDetail();
        obj2.displayDetail();

    }
}