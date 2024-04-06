package domain;

public class Student {
    private final int stdId;
    private final String name;
    private final Grade grade;

    public Student(int stdId, String name, int koreanGrade, int englishGrade, int mathGrade){
        this.stdId = stdId;
        this.name = name;
        this.grade = new Grade(koreanGrade, englishGrade, mathGrade);
    }

    public int getStdId(){ return stdId; }
    public String getName(){ return name; }
    public Grade getGrade(){ return grade; }
}
