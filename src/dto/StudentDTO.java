package dto;

import domain.Grade;

public class StudentDTO {
    private final int stdId;
    private String name;
    private Grade grade;

    public StudentDTO(int stdId, String name, int koreanGrade, int englishGrade, int mathGrade){
        this.stdId = stdId;
        this.name = name;
        this.grade = new Grade(koreanGrade, englishGrade, mathGrade);
    }

    public int getStdId() {
        return stdId;
    }
    public String getName() {
        return name;
    }
    public Grade getGrade(){
        return grade;
    }
    public void setName(String name){ this.name = name; }
    public void setGrade(Grade grade){
        grade.setAverage();
        this.grade = grade;
    }

}
