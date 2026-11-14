
public class CountElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20, 50};
        int target = 20;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
