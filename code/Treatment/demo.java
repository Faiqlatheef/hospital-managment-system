/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        Treatment toothImplant = new Treatment(1, "tooth implant");
        Treatment scalingAndCleaning = new Treatment(2, "scaling and cleaning");
        Treatment antibioticTreatment = new Treatment(3, "antibiotic treatment");

        toothImplant.addSubordinatesTreatment(scalingAndCleaning);
        scalingAndCleaning.addSubordinatesTreatment(antibioticTreatment);

        toothImplant.displayDetail();
        for (Treatment scalingAndCleaningObj : toothImplant.getSubordinates()) {
            scalingAndCleaningObj.displayDetail();
            for (Treatment antibioticTreatmentobj : scalingAndCleaningObj.getSubordinates()) {
                antibioticTreatmentobj.displayDetail();
            }
        }

    }
}