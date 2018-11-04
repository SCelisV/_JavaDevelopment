public class BucleFor9{
    public static void main (String[] args){
        // Si se quitarán las llaves delimitadoras del ámbito del bucle for, sólo se ejecutaría la Suma 
        // La impresión se ejecutará al terminar el bucle y sólo imprime el resultado final - línea 9
        // pero ahora no se puede probar porque el compilador lo valida..
        int Suma = 0;
        for(int i=1;i<=1000;i++){
            Suma = Suma + i;
            System.out.println("i: "+ i + " - Suma: " + Suma);
        }
    }
}