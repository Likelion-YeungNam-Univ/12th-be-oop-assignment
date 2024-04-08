package View;

import domain.Grade;
import domain.Student;
import dto.StudentDTO;
import repository.StudentsRepository;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class OutputView {
    private static final String MENU_BAR_MSG = "1. 학생 등록, 2. 학생 전체 조회, 3. 학생 검색, 4. 학생 정보 수정, 5. 학생 삭제, 6. 종료";
    private static final String EXIT_MSG  = "프로그램을 종료합니다.";
    private static final String WRONG_INPUT_MSG = "잘못된 입력입니다.";
    private static final String STUDENT_REGISTER_PRINT = "\n<학생 등록>";
    private static final String STUDENT_INFO_PRINT = "\n<학생 출력>";
    public static final String STUDENT_SEARCH_PRINT = "\n<학생 검색>";
    public static final String STUDENT_EDIT_PRINT = "\n<학생 수정>";
    public static final String STUDENT_DELETE_PRINT = "\n<학생 삭제>";
    private static final String STUDENT_INFO_PRINT_FORMAT = "- %s\n학번 : %d\n국어성적 : %3d, 영어성적 : %3d, 수학성적 : %3d\n\n";

    public static void printMenuBar(){
        System.out.println(MENU_BAR_MSG);
    }
    public static void printAllStudents(){
        StudentsRepository studentsRepository = new StudentsRepository();
        System.out.println(STUDENT_INFO_PRINT);
        Map<Integer, Student> students = studentsRepository.findAll();
        Student student;
        for (Entry<Integer, Student> entrySet : students.entrySet())
        {
            student = entrySet.getValue();
            printStudentInfo(student);
        }
    }
    public static void printRegister(){
        System.out.println(STUDENT_REGISTER_PRINT);
    }
    public static void printSearchSubject(){
        System.out.println(STUDENT_SEARCH_PRINT);
    }
    public static void printEditSubject(){ System.out.println(STUDENT_EDIT_PRINT); }
    public static void printDeleteSubject() { System.out.println(STUDENT_DELETE_PRINT); }
    public static void printExit(){
        System.out.println(EXIT_MSG);
    }
    public static void printWrong(){
        System.out.println(WRONG_INPUT_MSG);
    }
    public static void printSearchedStudent(StudentDTO studentDTO) {
        StudentsRepository studentsRepository = new StudentsRepository();
        Student student = studentsRepository.findById(studentDTO.getStdId());
        printStudentInfo(student);
    }
    public static void printStudentInfo(Student student){
        Grade grade = student.getGrade();
        System.out.printf(STUDENT_INFO_PRINT_FORMAT, student.getName(), student.getStdId(),
                grade.getKoreanGrade(), grade.getEnglishGrade(), grade.getMathGrade() );
    }
}
