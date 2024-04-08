package domain;

import dto.StudentDTO;

public class Student {
    private final int stdId;
    private String name;
    private Grade grade;

    public Student(StudentDTO studentDTO){
        this.stdId = studentDTO.getStdId();
        this.name = studentDTO.getName();
        this.grade = studentDTO.getGrade();
    }

    public int getStdId(){ return stdId; }
    public String getName(){ return name; }
    public Grade getGrade(){ return grade; }

}
