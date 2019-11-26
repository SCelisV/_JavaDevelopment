public class PruebaTelefono{
    public static void main(String[] args) {
        
        // Máxima capacidad de almacenamiento 2 llamadas
        Telefono ModeloBarato = new Telefono(2);
        // Máxima capacidad de almacenamiento 4 llamadas
        Telefono ModeloMedio = new Telefono(4);

        ModeloBarato.Llamar("670879078");
        ModeloBarato.Llamar("670674590");
        // Devuelve el último número de teléfono llamado
        System.out.println("MB_UltimaLlamada: " + ModeloBarato.UltimaLlamada());
        // ModeloBarato.penúltima llamada
        ModeloBarato.Llamar("670234590");
        // ModeloBarato.última llamada
        ModeloBarato.Llamar("670069423");
        System.out.println("MB_Llamada(1): " + ModeloBarato.Llamada(1));
        
        ModeloMedio.Llamar("670879078");
        ModeloMedio.Llamar("670674590");
        // Devuelve el último número de teléfono llamado
        System.out.println("MM_UltimaLlamada: " + ModeloMedio.UltimaLlamada());
        ModeloMedio.Llamar("670234590");
        ModeloMedio.Llamar("670069423");
        // ModeloMedio.penúltima llamada
        ModeloMedio.Llamar("670069498");
        // ModeloMedio.última llamada
        ModeloMedio.Llamar("670069499");
        System.out.println("MM_Llamada(1): " + ModeloMedio.Llamada(1));
    }
}