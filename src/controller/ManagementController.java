package controller;

import View.InputView;
import View.OutputView;
import dto.StudentDTO;
import service.ManagementService;
import java.util.Scanner;

public class ManagementController {
    ManagementService managementService;
    private static final Scanner scan = new Scanner(System.in);

    public ManagementController() {
        managementService= new ManagementService();
    }

    public void run(){
        try {
            while (true) {
                OutputView.printMenuBar();
                int cmd = InputView.readMenuBarCmd(scan);
                switch (cmd) {
                    case 1://학생  등록
                        OutputView.printRegister();
                        StudentDTO studentDTO = managementService.inputStudent(scan);
                        managementService.createStudent(studentDTO);
                        break;
                    case 2://학생 정보 출력
                        OutputView.printAllStudents();
                        break;
                    case 3://학생 찾기
                        OutputView.printSearchSubject();
                        StudentDTO searchStudentDTO = managementService.searchStudent(scan);
                        OutputView.printSearchedStudent(searchStudentDTO);
                        break;
                    case 4://학생 정보 수정
                        OutputView.printEditSubject();
                        managementService.editStudent(scan);
                        break;
                    case 5://학생 삭제
                        OutputView.printDeleteSubject();
                        managementService.deleteStudent(scan);
                        break;
                    case 6://종료
                        OutputView.printExit();
                        return;
                    default:
                        OutputView.printWrong();
                }
            }
        } catch(IllegalArgumentException e){
            System.out.println("오류 발생");
        }
    }

}
