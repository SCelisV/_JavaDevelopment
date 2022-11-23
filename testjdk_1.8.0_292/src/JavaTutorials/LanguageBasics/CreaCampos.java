/*
 * Cree un pequeño programa que defina algunos campos. 
 * Intente crear algunos nombres de campo ilegales y vea qué tipo de error produce el compilador.
 * Utilice las reglas y convenciones de nomenclatura como guía.
 * intenta dejar los campos sin inicializar e imprime sus valores. 
 * Pruebe lo mismo con una variable local y vea qué tipo de errores del compilador puede producir.
 * Familiarizarse con los errores comunes del compilador hará más fácil reconocer los errores en su código.
 */
package JavaTutorials.LanguageBasics;

public class CreaCampos {

    // variable de clase
    static String campo;

    // variable de instancia 
    String variable;


    void setVariable(String value){
        this.variable = value;
    }

    String getVariable(){
        return this.variable;
    }

    static void ImprimeLocal(){
        // The local variable variableLocal may not have been initialized
        // int variableLocal;
        int variableLocal = 0;
        System.out.println("variableLocal: " + variableLocal);
    }

    public static void main(String[] args) {
        
        // Esta bien pero por convención es mejor que empiece con una letra
        String _pepito = "Hola don Pepito";
        // Syntax error on token "@", ; expectedJava(1610612940) 
        // cannot be resolved to a variableJava(33554515)
        // String J@se = "Hola don J@se";
        
        // Esta bien pero por convención es mejor que empiece con una letra
        String $jose = "Hola don Jose";
        System.out.println (_pepito);
        System.out.println ($jose);

        // Esta mal creada no se admiten espacios en blanco
        // String ca sa = "Paso usted por mi casa?";
        // System.out.println (ca sa);

        // Esta bien pero no indica que se almacena en este campo 
        String p = "Paso usted por mi casa?";
        System.out.println (p); // Paso usted por mi casa?

        System.out.println("Esta es una variable de clase: " + CreaCampos.campo); // Esta es una variable de clase: null
        System.out.println("Esta es una variable de instancia: " + new CreaCampos().getVariable()); // Esta es una variable de instancia: null

        ImprimeLocal(); //variableLocal: 0
    }
    
}