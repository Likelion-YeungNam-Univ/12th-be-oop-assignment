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
    public void run(){
        while(true){
            OutputView.printMenuBar();
            int input = InputView.readMenuBarCmd();
            switch (input){
                case 1:
                    Student student = inputStudent();
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
        int stdId = InputView.readStudentId();
        String name = InputView.readStudentName();
        int koreanGrade = InputView.readKoreanGrade();
        int englishGrade = InputView.readEnglishGrade();
        int math = InputView.readMathGrade();

    }
}
