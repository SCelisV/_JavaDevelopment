

import java.util.Scanner;

public class PruebaScanner_Teclado{

    public static void main(String[] args){

        System.out.println("Escriba.............: ");
        Scanner sc = new Scanner(System.in);
        Scanner scAux = sc;

        try {
            byte bSC = Scanner_Teclado.getByte(scAux);
            System.out.println("byte: " + bSC);
        } catch (Exception e) { } // NO es obligatorio tratar la excepcion 
        try {
            short sSC = Scanner_Teclado.getShort(scAux);
            System.out.println("short: " + sSC);
        } catch (Exception e) { }
        try {
            int iSC = Scanner_Teclado.getInt(scAux);
            System.out.println("int: " + iSC);
        } catch (Exception e) { }
        try {
            long lSC = Scanner_Teclado.getLong(scAux);
            System.out.println("Long: " + lSC);
        } catch (Exception e) { }
        try {
            float fSC = Scanner_Teclado.getFloat(scAux);
            System.out.println("float: " + fSC);
        } catch (Exception e) { }
        try {
            double dSC = Scanner_Teclado.getDouble(scAux);
            System.out.println("double: " + dSC);
        } catch (Exception e) { }
        try {
            String strSC = Scanner_Teclado.getString(scAux);
            System.out.println("String: " + strSC);
        } catch (Exception e) { }
    }
}