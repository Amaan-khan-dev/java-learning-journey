import java.util.Scanner;

public class License {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for license");
        } else {
            System.out.println("Beta cycle chalao");
        }
    }
}