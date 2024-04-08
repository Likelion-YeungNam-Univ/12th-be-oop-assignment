package service;

import View.InputView;
import View.OutputView;
import domain.Grade;
import domain.Student;
import dto.StudentDTO;
import repository.StudentsRepository;

import java.util.List;
import java.util.Scanner;

public class ManagementService {
    public static final StudentsRepository studentRepository = new StudentsRepository();
    public StudentDTO inputStudent(Scanner scan){
        int stdId = InputView.readStudentID(scan);
        String name = InputView.readStudentName(scan);
        int koreanGrade = InputView.readKoreanGrade(scan);
        int englishGrade = InputView.readEnglishGrade(scan);
        int mathGrade = InputView.readMathGrade(scan);
        return new StudentDTO(stdId, name, koreanGrade, englishGrade, mathGrade);
    }

    public void createStudent(StudentDTO studentDTO) {
        Student student = new Student(studentDTO);
        studentRepository.save(student);
    }

    public Student findStudent(Scanner scan){
        int searchStdId = InputView.readStudentID(scan);
        return studentRepository.findById(searchStdId);
    }
    public StudentDTO searchStudent(Scanner scan){
        Student student = findStudent(scan);
        Grade grade = student.getGrade();
        return new StudentDTO(student.getStdId(), student.getName(), grade.getKoreanGrade(), grade.getEnglishGrade(), grade.getMathGrade());
    }

    public void editStudent(Scanner scan){
        StudentDTO studentDTO = searchStudent(scan);
        Grade grade = studentDTO.getGrade();

        int editCmd = InputView.readEditCmd(scan);

        switch (editCmd){
            case 1:
                String name = InputView.readStudentName(scan);
                studentDTO.setName(name);
                break;
            case 2:
                int koreanGrade = InputView.readKoreanGrade(scan);
                grade.setKoreanGrade(koreanGrade);
                studentDTO.setGrade(grade);
                break;
            case 3:
                int englishGrade = InputView.readEnglishGrade(scan);
                grade.setEnglishGrade(englishGrade);
                studentDTO.setGrade(grade);
                break;
            case 4:
                int mathGrade = InputView.readMathGrade(scan);
                grade.setMathGrade(mathGrade);
                studentDTO.setGrade(grade);
                break;
            case 5:
                break;
            default:
                OutputView.printWrong();
        }
        createStudent(studentDTO);
    }

    public void deleteStudent(List<Student> students, int stdId) {
        students.removeIf(student -> student.getStdId() == stdId);
    }
}
