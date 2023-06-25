package studentprogram;

public class Student {
    public int studentId;
    public String name;
    public char Grade;
    public float marks[];

    public Student(int studentId, String name, float[] marks) {
        this.studentId = studentId;
        this.name = name;
        //Grade = grade;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public char getGrade() {
//        return Grade;
//    }
//
//    public void setGrade(char grade) {
//        Grade = grade;
//    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float calculateAverage() {
        float sum = 0, count = 0;
        for (float i : marks) {
            sum += i;
            count++;
        }
        float average = sum / count;
        return average;
    }
    public char calculateGrade() {
        if (calculateAverage()!=0) {
            if (calculateAverage() >= 90 && calculateAverage() <= 100)
                return 'A';
            else if (calculateAverage() >= 80 && calculateAverage() <= 89)
                return 'B';
            else if (calculateAverage() >= 70 && calculateAverage() <= 79)
                return 'C';
            else if (calculateAverage() >= 60 && calculateAverage() <= 69)
                return 'D';
        } else {
            return 'F';
        }
        return 0;
    }
    public int getRanking()
    {
        return 0;
    }
}

