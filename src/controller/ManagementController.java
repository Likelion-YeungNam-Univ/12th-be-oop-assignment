package controller;

import View.InputView;
import View.OutputView;
import domain.Student;
import validate.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementController {
    private static final List<Student> Students = new ArrayList<>();
    private static final Scanner scan = new Scanner(System.in);
    public void run(){
        while(true){
            OutputView.printMenuBar();
            int input = InputView.readMenuBarCmd(scan);
            switch (input){
                case 1:
                    Student student = inputStudent();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    OutputView.printExit();
                    return;
                default:
                    OutputView.printWrong();
            }
        }
    }

    Student inputStudent(){
        int stdId = InputView.readStudentId(scan);
        scan.nextLine();
        String name = InputView.readStudentName(scan);
        int koreanGrade = InputView.readKoreanGrade(scan);
        int englishGrade = InputView.readEnglishGrade(scan);
        int mathGrade = InputView.readMathGrade(scan);
        return new Student(stdId, name, koreanGrade, englishGrade, mathGrade);
    }
}
