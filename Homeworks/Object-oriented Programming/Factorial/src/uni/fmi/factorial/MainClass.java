/* Write a java program that find factorial of number */
package uni.fmi.factorial;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Please enter number to find factorial:");
        long number = input.nextLong();

        long factorial = factorial(number);
        System.out.println(factorial);
    }

    public static long factorial(long number) {
        if(number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
