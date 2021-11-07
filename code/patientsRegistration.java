public class patientsRegistration {
    private double rAmount;
    private String patient;
    private String registrationDate;

    public patientsRegistration(int _id, String _date, double _fee, double _total, double _discount, double rAmount, String patient, String registrationDate){
        
        this.patient=patient;
        this.rAmount=rAmount;
        this.registrationDate=registrationDate;

    }
}