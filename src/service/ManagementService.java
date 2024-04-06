package service;

import View.InputView;
import View.OutputView;
import domain.Grade;
import domain.Student;

import java.util.List;
import java.util.Scanner;

public class ManagementService {
    public Student inputStudent(Scanner scan){
        OutputView.printRegister();

        int stdId = InputView.readStudentID(scan);
        String name = InputView.readStudentName(scan);
        int koreanGrade = InputView.readKoreanGrade(scan);
        int englishGrade = InputView.readEnglishGrade(scan);
        int mathGrade = InputView.readMathGrade(scan);

        return new Student(stdId, name, koreanGrade, englishGrade, mathGrade);
    }

    public Student searchStudent(List<Student> students, int stdId){
        for(Student student: students){
            if(student.getStdId()==stdId){
                return student;
            }
        }
        return null;
    }

    public void editStudent(Student student, Scanner scan){
        int editCmd = InputView.readEditCmd(scan);
        Grade grade = student.getGrade();
        switch (editCmd){
            case 1:
                String name = InputView.readStudentName(scan);
                student.setName(name);
                break;
            case 2:
                int koreanGrade = InputView.readKoreanGrade(scan);
                grade.setKoreanGrade(koreanGrade);
                student.setGrade(grade);
                break;
            case 3:
                int englishGrade = InputView.readEnglishGrade(scan);
                grade.setEnglishGrade(englishGrade);
                student.setGrade(grade);
                break;
            case 4:
                int mathGrade = InputView.readMathGrade(scan);
                grade.setMathGrade(mathGrade);
                student.setGrade(grade);
                break;
            case 5:
                break;
            default:
                OutputView.printWrong();
        }
    }

    public void deleteStudent(List<Student> students, int stdId) {
        students.removeIf(student -> student.getStdId() == stdId);

    }
}
