package View;

import domain.Grade;
import domain.Student;

import java.util.List;

public class OutputView {
    private static final String MENU_BAR_MSG = "1. 학생 등록, 2. 학생 전체 조회, 3. 학생 검색, 4. 학생 정보 수정, 5. 학생 삭제, 6. 종료";
    private static final String EXIT_MSG  = "프로그램을 종료합니다.";
    private static final String WRONG_CMD_MSG = "잘못된 입력입니다.";
    private static final String STUDENT_INFO_PRINT = "<학생 출력>";

    private static final String STUDENT_INFO_PRINT_FORMAT = "<%s>\n학번 : %d\n 국어성적 : %3d, 영어성적 : %3d, 수학성적 : %3d\n";
    public static void printMenuBar(){
        System.out.println(MENU_BAR_MSG);
    }
    public static void printAllStudents(List<Student> students){
        System.out.println(STUDENT_INFO_PRINT);
        for (Student student : students){
            Grade grade = student.getGrade();
            System.out.printf(STUDENT_INFO_PRINT_FORMAT, student.getName(), student.getStdId(),
                    grade.getKoreanGrade(), grade.getEnglishGrade(), grade.getMathGrade() );
        }
    }
    public static void printExit(){
        System.out.println(EXIT_MSG);
    }
    public static void printWrong(){
        System.out.println(WRONG_CMD_MSG);
    }
}
