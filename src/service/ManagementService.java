package service;

import View.InputView;
import domain.Student;

import java.util.Scanner;

public class ManagementService {
    public Student inputStudent(Scanner scan){
        int stdId = InputView.readStudentId(scan);
        String name = InputView.readStudentName(scan);
        int koreanGrade = InputView.readKoreanGrade(scan);
        int englishGrade = InputView.readEnglishGrade(scan);
        int mathGrade = InputView.readMathGrade(scan);
        return new Student(stdId, name, koreanGrade, englishGrade, mathGrade);
    }

}
