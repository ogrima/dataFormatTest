package br.com.grima;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatada {

    public static void main(String[] args) {
        Date data = new Date();

        String pattern1="dd/MM/yyyy HH:mm:ss";
        String pattern2="dd/MM/yyyy'T'HH:mm:ss.SSS";
        String pattern3="dd/MM/yyyy'T'HH:mm:ss.SSSZ";
        String pattern4="dd/MM/yyyy'T'HH:mm:ss.SSSZZ";
        String pattern5="dd/MM/yyyy'T'HH:mm:ss.SSSz";
        String pattern6="dd/MM/yyyy'T'HH:mm:ss.SSSZZZ";

        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        SimpleDateFormat sdf3 = new SimpleDateFormat(pattern3);
        SimpleDateFormat sdf4 = new SimpleDateFormat(pattern4);
        SimpleDateFormat sdf5 = new SimpleDateFormat(pattern5);
        SimpleDateFormat sdf6 = new SimpleDateFormat(pattern6);

        System.out.println("1 - " + pattern1 + " - " + sdf1.format(data));
        System.out.println("2 - " + pattern2 + " - " + sdf2.format(data));
        System.out.println("3 - " + pattern3 + " - " + sdf3.format(data));
        System.out.println("4 - " + pattern4 + " - " + sdf4.format(data));
        System.out.println("5 - " + pattern5 + " - " + sdf5.format(data));
        System.out.println("6 - " + pattern6 + " - " + sdf6.format(data));
    }




}
