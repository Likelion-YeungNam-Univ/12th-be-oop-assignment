package domain;

import dto.StudentDTO;
import validate.Validate;

public class Student {
    private final int stdId;
    private final String name;
    private final Grade grade;

    protected Student(StudentDTO studentDTO){
        validate(studentDTO);
        this.stdId = studentDTO.getStdId();
        this.name = studentDTO.getName();
        this.grade = studentDTO.getGrade();
    }

    public static Student fromDTO(StudentDTO studentDTO){
        return new Student(studentDTO);
    }

    public void validate(StudentDTO studentDTO){
        Validate.isValidStudentNumber(Integer.toString(studentDTO.getStdId()));
        Validate.isValidStudentGrade(studentDTO.getGrade());
    }
    public int getStdId(){ return stdId; }
    public String getName(){ return name; }
    public Grade getGrade(){ return grade; }

}
