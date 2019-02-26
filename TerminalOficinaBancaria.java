//1. import Terminal.*;
import Terminal.*;
//2. import Terminal.Ordenador;
import Terminal.Ordenador;
//3. import Terminal.Telefono;
//3. import Terminal.Ordenador;
//3. import Terminal.WebTV;
import Terminal.Telefono;
import Terminal.Ordenador;
import Terminal.WebTV;
// Solo podemos hacer uso desde fuera de un paquete las clases definidas como publicas en dicho paquete
public class TerminalOficinaBancaria{
    //1. podemos utilizar las referencias deseadas a las 3 clases del paquete Terminal.
    //2. podemos utilizar las referencias deseadas a la clase Ordenador
    //3. podemos utilizar las referencias deseadas a las 3 clases del paquete Terminal.

    // También podemos referenciar sus propiedades y métodos de manera directa, con caminos absolutos

    Terminal.Telefono MiTelefono = new Terminal.Telefono();
}