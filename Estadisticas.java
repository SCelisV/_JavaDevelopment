public class Estadisticas{

    //length nos da el tamaño de la Matriz
    static float Media(float [] Matriz){

        float Suma = 0;
        for ( int i=0; i < Matriz.length; i++ ){
            Suma = Suma + Matriz[i];
        }
        return(Suma / (Matriz.length) );
    }

    //Se necesita el valor medio de los valores para calcular la Variación
    static float Variacion(float [] Matriz){

        float Suma = 0;
        float Media = Media(Matriz);
        for ( int i=0; i < Matriz.length; i++){
            Suma = Suma + Math.abs( Media - Matriz[i] );
        }
        return (Suma/( Matriz.length ));

    }

    //Devuelve una matriz de dos valores
    static float [] MenorMayor( float[] Matriz ){

        float[] Auxiliar = new float[2]; //Contendrá el menor y el mayor valor
        Auxiliar[0] = Matriz[0]; //Por ahora el menor es el primero
        Auxiliar[1] = Matriz[0]; //Por ahora el mayor es el primero
        for( int i=0; i < Matriz.length; i++ ){
            if ( Matriz[i] < Auxiliar[0] )
                Auxiliar[0] = Matriz[i];
            if ( Matriz[i] > Auxiliar[1] )
                Auxiliar[1] = Matriz[i];
        }
        return Auxiliar;

    }

    public static void main (String [] args){

        float [] TemperaturasMadrid = { 6.7f, 5.8f, 14.5f, 15.0f, 18.5f, 22.3f, 35.6f, 38.0f, 28.6f, 19.4f, 14.6f, 8.5f };
        
        float [] TemperaturasGranada = { 5.2f, 4.6f, 12.5f, 19.3f, 16.2f, 24.5f, 37.2f, 37.0f, 29.3f, 18.2f, 10.3f, 7.5f };
        
        float [] PresionFebrero = { 800.2f, 810.5f, 815.2f, 825.6f, 837.4f, 850.2f, 860.4f,
                                    855.2f, 847.2f, 820.4f, 810.5f, 805.2f, 790.3f, 795.1f,
                                    790.4f, 786.6f, 780.6f, 770.3f, 770.4f, 777.7f, 790.3f,
                                    820.2f, 830.7f, 840.1f, 845.6f, 859.4f, 888.2f, 899.4f };

        float [] mM = new float[2]; //Matriz lineal de valores tipo float que contendrá el menor y el mayor valor, 

        System.out.println(" Media Temperaturas en Madrid: " + Media( TemperaturasMadrid ));
        

        System.out.println(" Variación Temperaturas en Madrid: " + Variacion( TemperaturasMadrid ));


        mM = MenorMayor( TemperaturasMadrid );

        System.out.println(" Menor y mayor temperatura de Madrid: " + mM[0] + " " + mM[1] );

        System.out.println();

        System.out.println(" Media Temperaturas en Granada: " + Media ( TemperaturasGranada ));

        System.out.println(" Variación Temperaturas en Granada: " + Variacion ( TemperaturasGranada ));

        mM = MenorMayor ( TemperaturasGranada );

        System.out.println(" Menor y mayor temperatura de Granada: " + mM[0] + " " + mM[1] );

        System.out.println();

        System.out.println(" Media Presion Febrero: " + Media ( PresionFebrero ));

        System.out.println(" Variación Presión Febrero: " + Variacion ( PresionFebrero ));

        mM = MenorMayor( PresionFebrero );

        System.out.println( " Menor y mayor presión de Febrero: " + mM[0] + " " + mM[1] );

        System.out.println();
    }
}