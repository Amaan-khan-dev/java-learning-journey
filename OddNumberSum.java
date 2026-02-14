import java.util.Scanner;
public class OddNumberSum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number for printing odd number sum: ");
		int num = input.nextInt();
		for ( int i = 1; i<=num; i++){
		    if(i%2 !=0){
		        System.out.println(i);
		        }
		    }
	}
}