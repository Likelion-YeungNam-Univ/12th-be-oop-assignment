package controller;

import View.InputView;
import View.OutputView;
import domain.Student;
import service.ManagementService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementController {
    ManagementService managementService;
    private static final Scanner scan = new Scanner(System.in);
    private static final List<Student> Students = new ArrayList<>();

    public ManagementController() {
        managementService= new ManagementService();
    }

    public void run(){
        while(true){
            OutputView.printMenuBar();
            int input = InputView.readMenuBarCmd(scan);
            switch (input){
                case 1:
                    Student student = managementService.inputStudent(scan);
                    Students.add(student);
                    break;
                case 2:
                    OutputView.printAllStudents(Students);
                case 3:
                    //검색
                case 4:
                    //수정
                case 5:
                    //삭제
                case 6:
                    OutputView.printExit();
                    return;
                default:
                    OutputView.printWrong();
            }
        }
    }

}
