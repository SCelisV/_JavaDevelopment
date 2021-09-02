/*
levantar la excepción cuando llega un caracter equivocado etc...
Resultaría útil pasarle a la excepción un texto indicando los caracteres permitidos en cada caso...
algo como throw new OpcionErronea("'+', '-', '*', '/')... etc
incorporando un constructor con parámetro (Strint msg).
*/

public class OpcionErronea extends Exception {

    // constructor
    OpcionErronea(){
        super("No valido");
    }
}
