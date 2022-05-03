/*

*/
public class PruebaStudentProfile2 {

    public static void main(String[] args){

        // should create two student profile instances that represent two different student profiles
        StudentProfile2 StudentA = new StudentProfile2("FirstName", "LastName", 2026, 5.0, "Computer Science");
        System.out.println(StudentA.firstName);
        System.out.println(StudentA.lastName);
        System.out.println(StudentA.expectedYearToGraduate);
        System.out.println(StudentA.gpa);
        System.out.println(StudentA.declaredMajor);

        // return the student profiles expected graduation year instance value to the console
        // recupero la variable
        System.out.println("Year Expected Graduation StudentA: " + StudentA.expectedYearToGraduate);

        StudentProfile2 StudentB = new StudentProfile2("Sonia", "Celis", 2021, 6.0, "Data Science");
        System.out.println(StudentB.firstName);
        System.out.println(StudentB.lastName);
        System.out.println(StudentB.expectedYearToGraduate);
        System.out.println(StudentB.gpa);
        System.out.println(StudentB.declaredMajor);

        // return the student profiles expected graduation year instance value to the console
        int expected = StudentB.incrementExpectedGraduationYear();
        // recupero la variable
        System.out.println("Year Expected Graduation StudentB: " + StudentB.expectedYearToGraduate);

        System.out.println("Year Expected Graduation StudentB: " + expected);
    }
    
}
