package Lesson4;

import java.util.Scanner;

public class Instalment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("What is your total loan amount?");
            double loanAmount = scanner.nextDouble();

            System.out.println("What is your monthly interest on the loan balance?");
            double loanInterest = (scanner.nextDouble() / 100);

            System.out.print("Enter your choice (1-2): ");
            System.out.println("1. Calculate the number of monthly payments that must be made to repay the loan in full");
            System.out.println("2. Calculate the amount of the monthly payment");

            int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("How much is your monthly payment?");
                double monthlyPayment = scanner.nextDouble();
                numberOfPayments(loanAmount, loanInterest, monthlyPayment);
            }
            case 2 -> {
                System.out.print("how many payments you want to make?");
                double numberOfPayments = scanner.nextDouble();
                sumOfMonthlyPayment(loanAmount, loanInterest, numberOfPayments);
            }
            default -> System.out.println("Invalid choice. Please enter a number between 1 and 2.");
        }
    }

    private static void numberOfPayments(double loanAmount, double loanInterest, double monthlyPayment) {
        double numberOfPayments = (-Math.log(1 - (loanAmount * loanInterest / monthlyPayment)) / Math.log(1 + loanInterest));
        System.out.println("Number of monthly payments: " + numberOfPayments);
    }

    private static void sumOfMonthlyPayment(double loanAmount, double loanInterest, double numberOfPayments) {
        double sumOfMonthlyPayment = (loanInterest * loanAmount) / (1 - Math.pow(1 + loanInterest, -numberOfPayments));
        System.out.println("The amount of the monthly payment: " + sumOfMonthlyPayment);
    }

}


