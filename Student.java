

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKorGr(int korGr) {
        this.korGr = korGr;
    }

    public int getKorGr() {
        return korGr;
    }

    public void setEngGr(int engGr) {
        this.engGr = engGr;
    }

    public int getEngGr() {
        return engGr;
    }

    public void setMatGr(int matGr) {
        this.matGr = matGr;
    }

    public int getMatGr() {
        return matGr;
    }
}

