package Chapter4;

import java.util.Scanner;

public class Ex4_23 {
    public static void main(String[] args) {

        //Financial application - payroll
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name: ");
        String name = input.nextLine();

        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextInt();

        System.out.println("Enter hourly pay rate: ");
        double hourly = input.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();

        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double gross = hours * hourly;
        double fedWithhold = gross * fedTax;
        double stateWithhold = gross * stateTax;

        System.out.println("Employee Name: " + name);
        System.out.printf("Hours Worked: %2.1f\n", hours);
        System.out.printf("Pay Rate: $%2.2f\n", hourly);
        System.out.printf("Gross Pay: $%3.1f\n", gross);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Withholding: $%2.1f\n", fedWithhold);
        System.out.printf("\tState Withholding: $%2.2f\n", stateWithhold);
        System.out.printf("\tTotal Deductions: $%2.2f\n",(fedWithhold + stateWithhold));
        System.out.printf("Net Pay: $%2.2f\n", (gross - (fedWithhold + stateWithhold)));

       }
}
