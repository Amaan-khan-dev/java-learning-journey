import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number for Factorial: ");
		int num = input.nextInt();
		int fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println(num + " Factorial = " + fact);
	}
}