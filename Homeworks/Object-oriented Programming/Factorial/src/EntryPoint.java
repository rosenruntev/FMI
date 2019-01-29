/* Write a java program that find factorial of number */
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number to find factorial:");
        int number = input.nextInt();

        int factorial = factorial(number);
        System.out.println(factorial);
    }

    public static int factorial(int number) {
        if(number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
