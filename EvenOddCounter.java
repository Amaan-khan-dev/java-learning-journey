import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Taking array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Counter variables
        int even = 0;
        int odd = 0;

        // Counting even and odd numbers
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        // Printing results
        System.out.println("Even numbers count = " + even);
        System.out.println("Odd numbers count = " + odd);

        input.close();
    }
}