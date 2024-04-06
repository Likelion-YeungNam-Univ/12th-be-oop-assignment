package service;

import View.InputView;
import View.OutputView;
import domain.Student;

import java.util.List;
import java.util.Scanner;

public class ManagementService {
    public Student inputStudent(Scanner scan){
        OutputView.printRegister();

        int stdId = InputView.readStudentId(scan);
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
}
