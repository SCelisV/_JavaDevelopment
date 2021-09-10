/*

*/
public class PruebaStudentProfile {

    public static void main(String[] args){

        // should create two student profile instances that represent two different student profiles
        StudentProfile StudentA = new StudentProfile("FirstName", "LastName", 2026, 5.0, "Computer Science");
        System.out.println(StudentA.firstName);
        System.out.println(StudentA.lastName);
        System.out.println(StudentA.expectedYearToGraduate);
        System.out.println(StudentA.gpa);
        System.out.println(StudentA.declaredMajor);

        // return the student profiles expected graduation year instance value to the console
        // recupero la variable
        System.out.println("Year Expected Graduation StudentA: " + StudentA.expectedYearToGraduate);

        StudentProfile StudentB = new StudentProfile("Sonia", "Celis", 2021, 6.0, "Data Science");
        System.out.println(StudentB.firstName);
        System.out.println(StudentB.lastName);
        System.out.println(StudentB.expectedYearToGraduate);
        System.out.println(StudentB.gpa);
        System.out.println(StudentB.declaredMajor);

        // return the student profiles expected graduation year instance value to the console
        // ejecuto el método 
        StudentB.incrementExpectedGraduationYear();
        // recupero la variable
        System.out.println("Year Expected Graduation StudentB: " + StudentB.expectedYearToGraduate);
    }
    
}
