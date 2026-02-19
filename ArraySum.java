import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Program of Array Sum & Average");

		System.out.print("Enter Size of an Array :   ");
		int size = input.nextInt();
		int [] numArray = new int[size];
		int i = 0;
		while (i < size) {
			System.out.print("pls enter element no" + (i + 1) + ": ");

			numArray[i] = input.nextInt();
			i++;
		}
		System.out.println("The sum of Array is: " + sum(numArray));
	}

	public static long sum(int[] numArray) {
		int 	sum = 0;
		int 	i = 0;
		while (i < numArray.length) {
			sum = sum + numArray[i];
			i++;
		}

		return sum;
	}
}