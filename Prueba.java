import java.text.*;
import java.util.GregorianCalendar;

public class Prueba{
    // Clase de pruebas
    //
    // Definición de variables
    //
    private String str;
    private GregorianCalendar gc;

    /**
     * Define el valor de la propiedad str.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStr(String value) {
        this.str = value;
    }
    /**
     * Obtiene el valor de la propiedad str.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStr() {
        return str;
    }
}