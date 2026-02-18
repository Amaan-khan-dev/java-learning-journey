//Write a program to read two numbers from    
//user and print 
//their product. Assignment No.1

import java.util.Scanner;
public class Product {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to The Multiplication Programme");

		System.out.print("Enter 1st Number: ");
		int num1 = input.nextInt();

		System.out.print("Enter 2nd Number: ");
		int num2 = input.nextInt();

		int product = num1 * num2;

		System.out.println("Product of a Two number is: " + product);
	}
}