class Student {

    int rollno;
    String name;
    int studentClass;
    int division;

    public void isIntelligent(int mark) {

        if(mark < 40) {
            System.out.println("Fail");
        }
        else if(mark >= 40 && mark < 60) {
            System.out.println("Pass C grade");
        }
        else if(mark >= 60 && mark < 80) {
            System.out.println("Pass B grade");
        }
        else if(mark >= 80 && mark <= 100) {
            System.out.println("Pass A grade");
        }

    }
}

public class ClassObject{
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Amaan";
        s1.rollno = 1;

        System.out.println(s1.name);

        s1.isIntelligent(15);   // calling method

    }
}