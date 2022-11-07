package methods_and_inheritance.Code03_02_2;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // define una variable de typo ArrayList y la declara como final
    // Aunque la variable final no puede ser cambiada después de ser inizializada, el objeto puede ser cambiado a través de la referencia siempre y cuando el objeto sea mutable
    final ArrayList<String> array = new ArrayList<>();

    // adiciona aleatoriamente objetos de tipo String al ArrayList
    array.add("Hello");
    array.add("World");
    array.add("!");

    // imprime el ArrayList en la consola
    System.out.println(array); // [Hello, World, !]
  }
}