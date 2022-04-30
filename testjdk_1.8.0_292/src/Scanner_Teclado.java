
/*
Esta clase recupera lo que recibe por teclado y lo convierte al tipo de datos necesario
*/

import java.util.Scanner;

public class Scanner_Teclado {

    // propiedades
    Scanner sc;

    Scanner_Teclado(Scanner sc){
        this.sc = sc;
    }


    public static byte getByte(Scanner sc){
        try {
            byte b = sc.nextByte();
            sc.close();
            return b;
        } catch (Exception e) {
            System.out.println("catch getByte (byte - 1byte from -128 to 127): ");
            return 0;
        }
    }
    public static short getShort(Scanner sc){
        try {
            short s = sc.nextShort();
            sc.close();
            return s;
        } catch (Exception e) {
            System.out.println("catch getShort (short - 2bytes from -32768 to 32767): ");
            return 0;
        }
    } 
    public static int getInt(Scanner sc){
        try {
            int i = sc.nextInt();
            sc.close();
            return i;
        } catch (Exception e) {
            System.out.println("catch getInt (int - 4byte from -2^31 to 2^31 :: -32769 to 2147483647): ");
            return 0;
        }
    }
    public static long getLong(Scanner sc){
        try {
            long l = sc.nextLong();
            sc.close();
            return l;
        } catch (Exception e) {
            System.out.println("catch getLong (long 8bytes from -2^63 to 2^63 :: -2147483649 to 9223372036854775807): ");
            return 0L;
        }
    }
    public static float getFloat(Scanner sc){
        try {
            float f = sc.nextFloat();
            sc.close();
            return f;
        } catch (Exception e) {
            System.out.println("catch getFloat (float - 4byte from -3.4x10^38 to 3.4x10^38): ");
            return 0.0f;
        }
    }
    public static double getDouble(Scanner sc){
        try {
            double d = sc.nextDouble();
            sc.close();
            return d;
        } catch (Exception e) {
            System.out.println("catch getDouble (double - 8byte from -1.7x10^308 to 1.7x10^308): ");
            return 0.0d;
        }
    } 
    public static String getString(Scanner sc){
        try {
            String str = sc.next();
            sc.close();
            return str;
        } catch (Exception e) {
            System.out.println("catch getString (no es un String - ): ");
            return "null";
        }
    } 
}
