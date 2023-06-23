package studentprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTester {
    public static void main(String[] args) {
        float marks1[] = new float[]{60, 70, 80, 90, 89};
        float marks2[] = new float[]{80, 90, 78, 90, 89};
        float marks3[] = new float[]{90, 85, 86, 76, 78};
        float marks4[] = new float[]{85, 81, 74, 76, 91};
        float marks5[] = new float[]{83, 81, 98, 96, 91};
        float marks6[] = new float[]{74, 75, 72, 78, 91};

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(123, "Aarthi", marks1));
        studentList.add(new Student(125, "Krish", marks2));
        studentList.add(new Student(125, "Abishek", marks3));
        studentList.add(new Student(125, "Saran", marks4));
        studentList.add(new Student(125, "Divya", marks5));
        studentList.add(new Student(125, "Priya", marks6));

        for(Student stud:studentList)
        {
            float average = stud.calculateAverage();
            System.out.println("Average for student " + stud.getName() + ": "+average);
        }
            StudentService ss =new StudentService();
            float avg = ss.classAverage(studentList);
            System.out.println(avg);
        }
}
