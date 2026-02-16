public class Array {
	public static void main(String[] args) {
		//	int [] a= new int[5];
		int[] a = {1, 2, 3, 4, 5};
		/*	System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);*/
		int index = 0;
		while (index < a.length) {
			System.out.println(a[index]);
			index ++;
		}
	}
}