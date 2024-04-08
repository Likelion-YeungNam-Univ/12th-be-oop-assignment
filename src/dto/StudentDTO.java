package dto;

import domain.Grade;
import domain.Student;

public class StudentDTO {
    private final int stdId;
    private String name;
    private Grade grade;

    public StudentDTO(int stdId, String name, GradeDTO gradeDTO){
        this.stdId = stdId;
        this.name = name;
        this.grade = Grade.fromDTO(gradeDTO);
    }
    public StudentDTO(Student student){
        this.stdId = student.getStdId();
        this.name = student.getName();
        this.grade = student.getGrade();
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
