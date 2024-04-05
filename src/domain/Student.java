package domain;

public class Student {
    private int stdid;
    private String name;
    private Grade grade;

    public Student(int stdId, String name, int koreanGrade, int englishGrade, int mathGrade){
        this.stdid = stdId;
        this.name = name;
        this.grade = new Grade(koreanGrade, englishGrade, mathGrade);
    }
}
