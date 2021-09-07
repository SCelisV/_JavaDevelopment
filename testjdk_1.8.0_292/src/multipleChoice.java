/*
Hace una pregunta y da tres opciones de respuesta para que el usuario seleccione
*/
import java.util.Scanner;

public class multipleChoice {

    public static void main(String[] args){

        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter"; // is the largest planet in our solar system
        String choiceThree = "saturn";

        String correctAnswer = choiceTwo;
    
        // Write a print statemen asking the question
        System.out.println(question);
        // Write a print statemen giving the answer choices
        System.out.println("Choice one of the following: " + 
                choiceOne + ", " + choiceTwo + ", or " + choiceThree);
    
        // Have the user input an answer
        Scanner sc = new Scanner(System.in);
        // Retrive the user's answer
        String userAnswer = sc.next();

        // System.out.println("debug-correctAnswer: " +correctAnswer);
        // System.out.println("debug-userAnswer :" + userAnswer);

        sc.close();

        // if the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        // if(correctAnswer == userAnswer.toLowerCase()){// el resultado da false
        if(correctAnswer.equals(userAnswer.toLowerCase())){
            System.out.println("Congrats! That's the correct Answer " + correctAnswer);
        } else {
            System.out.println("You are incorrect Answer; the correct Answer is: " + correctAnswer);
        }

        // if the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a congrats message saying that the user is  incorrect
    
    }

}
