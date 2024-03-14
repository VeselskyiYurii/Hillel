package Lesson3;

import java.util.Scanner;

public class InfoAboutNumber {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number");
        int UserNumber = scanner.nextInt();

        if (UserNumber % 2 == 0) {
            System.out.println(UserNumber + " is a even number.");
        } else {
            System.out.println(UserNumber + " is a odd number.");
        }

        if (UserNumber < 0) {
            System.out.println(UserNumber + " is a negative number.");
        } else {
            System.out.println(UserNumber + " is a positive number.");
        }

        int remainder;
        boolean isPrime = true;

        for(int i=2;i<=UserNumber/2;i++) {
            remainder=UserNumber%i;

            if(remainder == 0) {

                isPrime=false;
                break;
            }
        }

        if(isPrime)
            System.out.println(UserNumber + " is a Prime number.");
        else
            System.out.println(UserNumber + " is not a Prime number.");
    }

}
