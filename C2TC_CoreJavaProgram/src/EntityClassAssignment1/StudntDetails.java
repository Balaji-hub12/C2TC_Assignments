package EntityClassAssignment1;

public class StudntDetails {

    public static void main(String[] args) {
        Student s1 = new Student("Balaji", 101, "CSE");
        Student s2 = new Student("Harshitha", 102, "ECE");
        Student s3 = new Student("Prabha", 103, "EEE");

        System.out.println("Student Details:");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
