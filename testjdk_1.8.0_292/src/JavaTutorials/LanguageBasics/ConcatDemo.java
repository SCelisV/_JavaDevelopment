/*
 * + también puede utilizarse para concatenar (unir) dos cadenas
 */
package JavaTutorials.LanguageBasics;

public class ConcatDemo {
    
    public static void main(String[] args) {

        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;

        System.out.println(thirdString); // This is a concatenated string.
    }
}
