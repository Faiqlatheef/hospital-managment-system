import java.sql.*;
import java.sql.Date;
import java.util.*;

public abstract class employee {
    protected int eID,Mob;
    protected String eName,NIC;
    protected String DOB;
    

    public abstract void add(employee _obj);

    abstract void display();

    public void displayInfo(){
        for (employee row: dB.employeeList ) {
            com.print("ID: "+ row.eID +"Name: "+ row.eName+"Mobile: "+ row.Mob+"Date of Birth: "+ row.DOB +"NIC: "+ row.NIC);
        }
    }
    

    public static void menu(){
        com.print("Home > Employee");
        com.print("-----------------");
        com.print("1-Add");
        com.print("2-View");
        com.print("3-Search");
        String ch = com.getInputData("=");

        if (ch.equals("1")) {
            com.print("Home > Employee > Add");
            com.print("-----------------");
            com.print("1-Nurses");
            com.print("2-Ordinary Doctors");
            com.print("3-Consultant Doctors");
            com.print("4-Dentist");
            com.print("5-Users");
            String ch1 = com.getInputData("=");

            switch (ch1) {
                case "1":
                    new nurse().addWithInput();
                    break;
                case "2":
                    new ordinaryDr().addWithInput();
                    break;
                case "3":
                    new consultantDr().addWithInput();
                    break;
                case "4":
                    new dentist().addWithInput();
                    break;
                case "5":
                    new user().addWithInput();
                    break;
            
                default:
                    break;
            }
        }

    }


}