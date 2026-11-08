import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Taking array input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element " + (i + 1) + ":");
            arr[i] = input.nextInt();
        }

        // Finding largest element
        int high = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > high) {
                high = arr[i];
            }
        }

        // Finding second largest element
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {

            if (arr[i] < high && arr[i] > second) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println("Largest element: " + high);
            System.out.println("Second largest element: " + second);
        }

        input.close();
    }
}