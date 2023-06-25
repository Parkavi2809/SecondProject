package studentprogram;

import java.util.List;

public class StudentService {
    public float classAverage(List<Student> studentList)
    {
        float clsavg =0;
        for(Student student:studentList)
        {
           clsavg += student.calculateAverage(); //calculate class averge
        }
        return clsavg/studentList.size();
    }
}
