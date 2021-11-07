public class payment {
    private int pID;
    private String pDate;
    private double pTotalAmount;
    private double pDiscount;
    private double pFinalAmount;

    public payment(int _id, String _date, double _pta, double _pd, double _pfa){
        this.pID=_id;
        this.pDate=_date;
        this.pTotalAmount=_pta;
        this.pDiscount=_pd;
        this.pFinalAmount=_pfa;
    }

    public static void menu(){
        
    }
}