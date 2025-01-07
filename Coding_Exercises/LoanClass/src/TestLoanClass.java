import java.util.Scanner;


public class TestLoanClass {

    public static void main(String[] args) {

//  Create a scanner
        Scanner sc = new Scanner(System.in);


//  Enter yearly interest rate
        System.out.println("Enter yearly interest rate, for example, 8.25: ");
        double annualInterestRate = sc.nextDouble();

//  Enter number of years
        System.out.println("Enter the number of years as an integer: ");
        int numberOfYears = sc.nextInt();

//  Enter loan amount
        System.out.println("Enter the loan amount, for example, 120000.95: ");
        double loanAmount = sc.nextDouble();


//  Create the Loan Object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);


// Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" +
                        "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }

}