package studentprogram;

public class StudentTester {
    public static void main(String[] args) {
        int marks1[] = new int[]{60,70,80,90,89};
        int marks2[] = new int[]{80,90,78,90,89};
        int marks3[] = new int[]{90,85,86,76,78};
        int marks4[] = new int[]{85,81,74,76,91};
        int marks5[] = new int[]{83,81,98,96,91};
        int marks6[] = new int[]{74,75,72,78,91};
        Student stud = new Student(123,"Aarthi",marks1);
        Student stud1 = new Student(125,"Krish",marks2);
        Student stud2 = new Student(125,"Abishek",marks3);
        Student stud3 = new Student(125,"Saran",marks4);
        Student stud4 = new Student(125,"Divya",marks5);
        Student stud5 = new Student(125,"Priya",marks6);
    }
}
