package controller;

import View.ErrorView;
import View.InputView;
import View.OutputView;
import dto.GradeDTO;
import dto.StudentDTO;
import service.ManagementService;
import validate.Validate;
import java.util.List;
import java.util.Scanner;

public class ManagementController {
    ManagementService managementService;
    private static final Scanner scan = new Scanner(System.in);

    public ManagementController() {
        managementService = new ManagementService();
    }

    public void run() {
        while (true) {
            try {
                OutputView.printMenuBar();
                String cmd = InputView.readMenuBarCmd(scan);
                Validate.isValidCmd(cmd);
                switch (cmd) {
                    case "1"://학생 등록
                        OutputView.printRegister();
                        StudentDTO studentDTO = inputStudent(scan);//
                        managementService.createStudent(studentDTO);
                        break;
                    case "2"://학생 정보 출력
                        List<StudentDTO> studentsDTO = managementService.findAll();
                        OutputView.printAllStudents(studentsDTO);
                        break;
                    case "3"://학생 찾기
                        OutputView.printSearchSubject();
                        StudentDTO searchStudentDTO = managementService.findStudent(scan);
                        OutputView.printSearchedStudent(searchStudentDTO);
                        break;
                    case "4"://학생 정보 수정
                        OutputView.printEditSubject();
                        StudentDTO editStudentDTO = managementService.findStudent(scan);
                        managementService.editStudent(editStudentDTO, scan);
                        break;
                    case "5"://학생 삭제
                        OutputView.printDeleteSubject();
                        managementService.deleteStudent(scan);
                        break;
                    case "6"://종료
                        OutputView.printExit();
                        return;
                    default:
                        OutputView.printWrong();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public StudentDTO inputStudent(Scanner scan) {
        try {
            int stdId = Integer.parseInt(InputView.readStudentID(scan));
            String name = InputView.readStudentName(scan);
            int koreanGrade = Integer.parseInt(InputView.readKoreanGrade(scan));
            int englishGrade = Integer.parseInt(InputView.readEnglishGrade(scan));
            int mathGrade = Integer.parseInt(InputView.readMathGrade(scan));
            GradeDTO gradeDTO = new GradeDTO(koreanGrade, englishGrade, mathGrade);
            return new StudentDTO(stdId, name, gradeDTO);
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorView.NOT_VALID_INPUT_CMD);
        }
    }


}
