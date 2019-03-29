/* Write a java program that checks if number is perfect */
package uni.fmi.perfectnumber;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Please enter number to check if it is perfect:");
        int number = input.nextInt();

        int sumOfDividers = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }

        if (number == sumOfDividers) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Number is not perfect");
        }
    }
}
