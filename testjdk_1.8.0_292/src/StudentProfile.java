/*

one behavior that the student's expected year to graduate by one.

Sometimes a student cannot get into the right classes in order to ga¡raduate on time and must graduate the following year
We should have a function that increments a student's expected graduation year by one

should create two student profile instances that represent two different student profiles

*/
public class StudentProfile {

    // Student Profile Attributes
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    // Grade Point Average is the average result of all your grades and is calculated on a 7-point grading scale.
    // 7 being the highest (HD), and
    // 0 is the lowest (fail).
    double gpa;
    String declaredMajor;

    // Constructores
    // that initializes all of the attributes with dynamic values, 
    // meaning the values that the constructor is called with will determine the values of the attributes
    StudentProfile( String firstName, String lastName, int expectedYearToGraduate,
                    double gpa, String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;

    }

    // print out their expected graduation year 
    public void incrementExpectedGraduationYear(){
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
