/*

Calculate an employee's salsry
input:
- how many hours that are worked per week
- how much the person makes per hour
output:
- employee's gross yearly salary
considerations
- Don't worry about taxes
- Bonus: add an input that accounts for vacation days
- The employee does not get paid for vacation days
- One vacation day = eight hours of work

*/

public class calculateEmployeesSalary {

    public static double salaryCalculator(double horasSemana, 
                                          double precioHora, 
                                          int diasVacaciones){

        if( horasSemana < 0){
            return -1;
        }
        if( precioHora < 0){
            return -1;
        }

        double pagoSemana =  horasSemana * precioHora;
        // final double SEMANAS_ANO = ((31/7)+(28/7)+(31/7)+(30/7)+(31/7)+(30/7)+(31/7)+(31/7)+(30/7)+(31/7)+(30/7)+(31/7));
        final double SEMANAS_ANO = 52.0;
        // System.out.println("pagoSemana:" + pagoSemana);
        // System.out.println("semanas: " + SEMANAS_ANO);
        double tiempoNoPagado = diasVacaciones * precioHora * 8;
        double pagoAnual = (pagoSemana * SEMANAS_ANO) - tiempoNoPagado;
        return pagoAnual;

    } 

    public static void main(String args[]) {

        double pagoAnual = salaryCalculator(40, 14, 22);
        System.out.println("pagoAnual: " + pagoAnual);

    }
    
}
