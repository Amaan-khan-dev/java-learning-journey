public class DemoClassObjectStudent {

	String name;
	int age;

		void display() {
		System.out.println("Name: " + name);
		System.out.println("age: " + age);
	}
}

class Main {

		public static void main(String[] args) {
		student s1 = new student();
		s1.name = "Amaan";
		s1.age = 18;
		s1.display();
	}
}