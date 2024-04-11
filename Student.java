

public class Student {
    String studentId;
    String name;
    int korGr;
    int engGr;
    int matGr;

    public Student(String studentId, String name, int korGr, int engGr, int matGr) {
        this.studentId = studentId;
        this.name = name;
        this.korGr = korGr;
        this.engGr = engGr;
        this.matGr = matGr;
    }

    public Object getStudentId() {
        return studentId;
    }

    public void setStudentId(Object studentId) {
        this.studentId = (String) studentId;
    }
}

