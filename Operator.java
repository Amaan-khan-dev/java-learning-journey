import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("WellCome to  java operatos program.");
		System.out.print("Enter 1st Number: ");
		int num1 = input.nextInt();
		System.out.print("Enter 2nd Number: ");
		int num2 = input.nextInt();

		int sum = num1 + num2;
		System.out.println("Addition of two numbers is: " + sum);
		int substration = num1 - num2;
		System.out.println("Substration of two numbers is: " + substration);
		int multiplication = (num1 * num2);
		System.out.println("Multiplication of a two number is: " + multiplication);
		int division = (num1 / num2);
		System.out.println("Division of two numbers is: " + division);
		int remainder = (num1 % num2);
		System.out.println("Remainder of two numbers is: " + remainder);
	}
}