/*
Cuando necesitamos hacer uso de todas o algunas de las clases de un paquete:
- Especificando la clase que se va a utilizar(junto con la referencia de su paquete);
    import Terminal.Ordenador;
- Se indica que se quiere hacer uso (potencialmente) de todas las clases del paquete.
    import Terminal.*;
SÓLO se pueden usar desde fuera de una paqueta las clases definidas como públicas dentro de ese paquete.
Estos paquetes de utilidades son tan comunes que no es necesario importarlos para usarlos
java.lang.Math
java.lang.String

Otra alternativa es no utilizar la sentencia import y referenciar los objetos con caminos absolutos:
Esto no es muy legible
Terminal.Telefono MiTelefono = new Terminal.Telefono(...);

*/

import Terminal.Ordenador;

class TerminalOficinaBancaria{
    // podemos utilizar las referencias deseadas a la clase Ordenador
    // podemos referenciar sus propiedades y métodos de manera directa

    Ordenador MiOrdenador = new Ordenador();
}

/*
ó

import Terminal.*;

class TerminalOficinaBancaria{
    // podemos utilizar las referencias deseadas a las 3 clases del paquete Terminal
    Telefono MiTelefono = new Telefono(...);

}
*/

/*
ó

import Terminal.Telefono;
import Terminal.Ordenador;
import Terminal.WebTV;

class TerminalOficinaBancaria{
    // podemos utilizar las referencias deseadas a las 3 clases del paquete Terminal
    Telefono MiTelefono = new Telefono(...);

}
*/