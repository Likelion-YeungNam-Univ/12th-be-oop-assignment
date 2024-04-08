package view;

import dto.GradeDTO;
import dto.StudentDTO;
import java.util.List;

public class OutputView {
    private static final String MENU_BAR_MSG = "1. 학생 등록, 2. 학생 전체 조회, 3. 학생 검색, 4. 학생 정보 수정, 5. 학생 삭제, 6. 종료";
    private static final String EXIT_MSG = "프로그램을 종료합니다.";
    private static final String WRONG_INPUT_MSG = "잘못된 입력입니다.";
    private static final String STUDENT_REGISTER_PRINT = "\n<학생 등록>";

    public static final String STUDENT_SEARCH_PRINT = "\n<학생 검색>";
    public static final String STUDENT_EDIT_PRINT = "\n<학생 수정>";
    public static final String STUDENT_DELETE_PRINT = "\n<학생 삭제>";
    private static final String STUDENT_INFO_PRINT_FORMAT = "- %s\n학번 : %d\n국어성적 : %3d, 영어성적 : %3d, 수학성적 : %3d\n평균 : %f\n\n";
    private static final String NO_STUDENTS = "학생 등록 후 사용가능합니다.";
    public static void printMenuBar() {
        System.out.println(MENU_BAR_MSG);
    }

    public static void printRegister() {
        System.out.println(STUDENT_REGISTER_PRINT);
    }

    public static void printSearchSubject() {
        System.out.println(STUDENT_SEARCH_PRINT);
    }

    public static void printEditSubject() {
        System.out.println(STUDENT_EDIT_PRINT);
    }

    public static void printDeleteSubject() {
        System.out.println(STUDENT_DELETE_PRINT);
    }

    public static void printExit() {
        System.out.println(EXIT_MSG);
    }

    public static void printWrong() {
        System.out.println(WRONG_INPUT_MSG);
    }

    public static void printSearchedStudent(StudentDTO studentDTO) {
        printStudentInfo(studentDTO);
    }

    public static void printAllStudents(List<StudentDTO> studentsDTO) {
        if (studentsDTO != null) {
            for (StudentDTO student : studentsDTO) {
                printStudentInfo(student);
            }
        }
        System.out.println(NO_STUDENTS);
    }

    public static void printStudentInfo(StudentDTO studentDTO) {
        GradeDTO gradeDTO = new GradeDTO(studentDTO.getGrade());
        System.out.printf(STUDENT_INFO_PRINT_FORMAT, studentDTO.getName(), studentDTO.getStdId(),
                gradeDTO.getKoreanGrade(), gradeDTO.getEnglishGrade(), gradeDTO.getMathGrade(), gradeDTO.getAverage());
    }
}
