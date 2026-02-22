import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter a number to check whether it's Positive Negative or Zero: ");
		int num = input.nextInt();

		if (num > 0) {
			System.out.println(num + " Is Positive Number.");
		} else if (num < 0) {
			System.out.println(num + " Is Negetive Number.");
		} else {
			System.out.println(num + " Iz Zero");
		}
	}
}