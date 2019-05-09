/*
    If you take out a loan from a bank of $10,000 with
    an annual interest rate of %5 percent, how much is your monthly payments over a term of
    36 months going to be? What if you pay $50 dollars more a month, how long will it take you
    then to pay it back then? Create a program which asks the user for a
    loan amount (principal), the interest rate and the term. Make it generate
    a payment schedule showing how much the user has to pay per month over the
    course of the term to pay it all back. At the end, print the how much the user
    will really pay over the course of the loan.
*/
package uni.fmi.mortgagetaxcalculator;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter principal loan amount:");
        double principalLoanAmount = Double.parseDouble(input.nextLine());
        System.out.println("Please enter interest rate:");
        double interestRate = Double.parseDouble(input.nextLine());
        System.out.println("Please enter the term in months:");
        int termInMonths = Integer.parseInt(input.nextLine());

        interestRate = (interestRate / 12) / 100;
        double monthlyPayment = interestRate / (1 - Math.pow(1 + interestRate, -termInMonths)) * principalLoanAmount;
        double monthlyPaymentRounded = Math.round(monthlyPayment * 100.0) / 100.0;
        double totalLoanAmountRounded = Math.round((monthlyPaymentRounded * termInMonths) * 100.0) / 100.0;
        System.out.println("Your monthly payment: $" + monthlyPaymentRounded);
        System.out.println("Total loan amount: $" + totalLoanAmountRounded);

        int monthsPaid = 0;
        double lastMonthPayment = 0;
        while(true) {
            if(totalLoanAmountRounded <= 0) {
                lastMonthPayment = Math.round(((monthlyPaymentRounded + 50) - Math.abs(totalLoanAmountRounded)) * 100.0) / 100.0;
                break;
            }

            totalLoanAmountRounded -= (monthlyPaymentRounded + 50);
            monthsPaid++;
        }

        System.out.printf("If you pay $50 more every month, your monthly payment will be $%.2f for %d months and " +
                "%dth month you should pay $%.2f", monthlyPaymentRounded + 50, monthsPaid - 1, monthsPaid, lastMonthPayment);
    }
}