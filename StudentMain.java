class Student {
    String name;
    int age;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Shiva";
        s1.age = 18;
        s1.rollNo = 101;

        s1.display();
    }
}