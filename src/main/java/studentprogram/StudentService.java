package studentprogram;

import java.util.List;

public class StudentService {
    public float classAverage(List<Student> studentList)
    {
        float clsavg =0;
        for(Student student:studentList)
        {
           clsavg += student.calculateAverage();
        }
        return clsavg/studentList.size();
    }
}
