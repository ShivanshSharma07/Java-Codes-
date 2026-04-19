class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        char grade;

        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'F';

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Student s1 = new Student("Shiva", 85);
        Student s2 = new Student("Rahul", 92);

        s1.display();
        System.out.println();
        s2.display();
    }
}