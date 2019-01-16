/* Write java program that checks triangle type by given three sides */
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first side of triangle:");
        int firstSide = input.nextInt();
        System.out.println("Please enter second side of triangle:");
        int secondSide = input.nextInt();
        System.out.println("Please enter third side of triangle:");
        int thirdSide = input.nextInt();

        if (((firstSide + secondSide) < thirdSide) || ((firstSide + secondSide) == thirdSide)) {
            System.out.println("Invalid triangle");
        } else if ((firstSide == secondSide) && (secondSide == thirdSide)) {
            System.out.println("The triangle is equilateral");
        } else if ((firstSide != secondSide) && (secondSide != thirdSide)) {
            System.out.println("The triangle is scalene");
        } else {
            System.out.println("The triangle is isosceles");
        }
    }
}
