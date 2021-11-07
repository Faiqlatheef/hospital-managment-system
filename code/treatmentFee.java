public class treatmentFee {
    int id;
    String date;
    private double amount, total, discount;
    private appointment appointment;

    public treatmentFee(int _id, String _date, double _fee, double _total, double _discount, double amount, appointment appointment){
        
        this.amount=amount;
        this.appointment= appointment;
        this.date=_date;
        this.discount=_discount;
        this.id=_id;
        this.total=_total;

    }
    static String getChoice = null;
    public static void menu(){
        com.print("Room - RS\n-----------------");
        com.print("1 - Add ");
        com.print("2 - Display ");

        com.print_input("What is your choice ? ");
        getChoice = com.getInput();

        switch (getChoice) {
            case "1":
            
                break;

            case "2":
                
                break;

        }
    
    }



}
