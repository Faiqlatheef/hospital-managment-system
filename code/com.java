import java.sql.Date;
import java.io.*;
import java.text.*;

public class com {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void print(Object message) {
        System.out.println(message);
    }

    // common function
    protected String strFun(int data) {
        return String.valueOf(data);
    }

    protected int intFun(String data) {
        return Integer.valueOf(data);
    }

    public static int intConvert(String str) {

        int myRet = 0;
        try {
            myRet = Integer.valueOf(str);
        } catch (NumberFormatException ex) {
            com.print(ex.getMessage());
        }

        return myRet;
    }

    public static String getInputData(String Message) {
        String myRet = null;
        try {

            System.out.print(Message);
            myRet = br.readLine();

        } catch (IOException ex) {
            com.print(ex.getMessage());
        }

        return myRet;
    }

    public static void print_input(Object message) {
        System.out.print(message);
    }

    public static String getInput() {
        String myRet = "";
        try {
            myRet = br.readLine();
        } catch (IOException ex) {
            com.print(ex.getMessage());
        }

        return myRet;

    }

    // public static Date covertStrToDate(String _date){
    //     Date myDate = new Date();
    //     try {
    //         myDate = new SimpleDateFormat("dd/MM/yyyy").parse(_date);
    //     } 
    //     catch (ParseException ex) {
    //         com.print(ex.getMessage());
    //     } 
    //     return myDate;
    // }
}