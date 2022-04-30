public class Switch9{
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // Calcular los días de los meses
    // CONSTANTES - final
    // Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre = 31 días
    // Febrero = 28 ó 29 días si es biciesto
    // Abril, Junio, Septiembre, Noviembre = 30 días
    public static void main(String[]args){

        byte MES = 0, DIAS = 0;
        boolean biciesto = true;

        final byte ENERO = 1, MARZO = 3, MAYO = 5, JULIO = 7, AGOSTO = 8, OCTUBRE = 10, DICIEMBRE = 12;
        final byte FEBRERO = 2;
        final byte ABRIL = 4, JUNIO = 6, SEPTIEMBRE = 9, NOVIEMBRE = 11;
        
        if (MES >=1 && MES <= 12){

            switch(MES){
            case FEBRERO:
                if (biciesto)
                    DIAS = 29;
                else
                    DIAS = 28;
                break;
            case ENERO: case MARZO: 
            case MAYO:
            case JULIO:
            case AGOSTO:
            case OCTUBRE:
            case DICIEMBRE:
                DIAS = 31;
                break;
            case ABRIL:
            case JUNIO:
            case SEPTIEMBRE:
            case NOVIEMBRE:
                DIAS = 30;
                break;
        }
        System.out.println("El mes: " + MES + " " + "Tiene" + " " + DIAS + " " + ("días"));
        } else System.out.println("Fecha Invalida");
    }
}