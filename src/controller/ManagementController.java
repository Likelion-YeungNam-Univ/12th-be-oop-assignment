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
    // 학번을 key, 나머지는 value로 하면 검색이 더 용이해질까? 어떤 자료구조가 맞을까?

    public ManagementController() {
        managementService= new ManagementService();
    }

    public void run(){
        while(true){
            OutputView.printMenuBar();
            int cmd = InputView.readMenuBarCmd(scan);
            switch (cmd){
                case 1:
                    Student addStudent = managementService.inputStudent(scan);
                    Students.add(addStudent);
                    break;
                case 2:
                    OutputView.printAllStudents(Students);
                    break;
                case 3:
                    OutputView.printSearchSubject();
                    int searchStdId = InputView.readStudentId(scan);
                    Student searchStudent = managementService.searchStudent(Students, searchStdId);
                    OutputView.printSearchedStudent(searchStudent);
                    break;
                case 4:
                    OutputView.printEditSubject();
                    int editStdId = InputView.readEditStudentID(scan);
                    Student editStudent = managementService.searchStudent(Students, editStdId);
                    managementService.editStudent(editStudent, scan);
                    break;
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
