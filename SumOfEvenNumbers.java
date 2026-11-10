public class SumOfEvenNumbers {

    public static void main(String[] args) {

        int[] arr = {4, 7, 2, 9, 6, 11};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}