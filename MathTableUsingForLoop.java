import java.util.Scanner;
public class MathTableUsingForLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for math table: ");
		int num = input.nextInt();
		int i;

		for (i = 1 ; i <= 10; i++) {
			System.out.println(num  + "x"  + i  + "= " + num * i);
		}
	}
}