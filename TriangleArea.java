import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base of triangle:");
        double base = input.nextDouble();

        System.out.println("Enter height of triangle:");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.printf("Area of Triangle is %.2f\n", area);

        input.close();
    }
}