public class Switch8{
    // La expresión asociada a la instrucción switch sólo debe generar valores de tipo:
    // char, byte, short o int.
    // Si no se incluye break, la ejecución pasa al siguiente case.
    // Calcular los días de los meses
    // Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre = 31
    // Febrero = 28 ó 29
    // Abril, Junio, Septiembre, Noviembre = 30
    public static void main(String[]args){

        byte MES = 0, DIAS = 0;
        boolean biciesto = true;

        /*
        Enero = 1, Marzo = 3, Mayo = 5, Julio = 7, Agosto = 8, Octubre = 10, Diciembre = 12, 31 días
        Febrero = 2, 28 ó 29 si es biciesto
        Abril = 4, Junio = 6, Septiembre = 9, Noviembre = 11, 30 días
        */
        
        if (MES >=1 && MES <= 12){

            switch(MES){
            case 2:
                if (biciesto)
                    DIAS = 29;
                else
                    DIAS = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                DIAS = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                DIAS = 30;
                break;
        }
        System.out.println("El mes: " + MES + " " + "Tiene" + " " + DIAS + " " + ("días"));
        } else System.out.println("Fecha Invalida");
    }
}