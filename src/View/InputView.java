package View;

import java.util.Scanner;

public class InputView {
    private static final String MENU_BAR_INPUT = "원하는 서비스 선택 : ";
    private static final String STUDENT_ID_INPUT = "학번 입력 : ";
    public static final String EDIT_STUDENT_ID_INPUT = "수정할 학생 학번 입력 : ";
    public static final String DELETE_STUDENT_ID_INPUT = "삭제할 학생 학번 입력 : ";
    private static final String STUDENT_NAME_INPUT = "이름 입력 : ";
    private static final String KOREAN_GRADE_INPUT = "국어성적 입력 : ";
    private static final String ENGLISH_GRADE_INPUT = "영어성적 입력 : ";
    private static final String MATH_GRADE_INPUT = "수학성적 입력 : ";
    private static final String EDIT_LIST = "수정항목 선택\n1. 이름, 2. 국어성적, 3. 영어성적, 4. 수학성적, 5. 메인메뉴 이동";

    public static int readMenuBarCmd(Scanner scan){
        System.out.print(MENU_BAR_INPUT);
        return scan.nextInt();
    }

    public static int readStudentID(Scanner scan){
        System.out.print(STUDENT_ID_INPUT);
        int stdId =  scan.nextInt();
        scan.nextLine();
        return stdId;
    }

    public static int readEditStudentID(Scanner scan){
        System.out.println(EDIT_STUDENT_ID_INPUT);
        return scan.nextInt();
    }

    public static String readStudentName(Scanner scan){
        System.out.print(STUDENT_NAME_INPUT);
        return scan.nextLine();
    }
    public static int readKoreanGrade(Scanner scan){
        System.out.print(KOREAN_GRADE_INPUT);
        return scan.nextInt();
    }
    public static int readEnglishGrade(Scanner scan){
        System.out.print(ENGLISH_GRADE_INPUT);
        return scan.nextInt();
    }

    public static int readMathGrade(Scanner scan){
        System.out.print(MATH_GRADE_INPUT);
        return scan.nextInt();
    }
    public static int readEditCmd(Scanner scan){
        System.out.println(EDIT_LIST);
        return scan.nextInt();
    }

    public static int readDeleteStudentID(Scanner scan) {
        System.out.print(DELETE_STUDENT_ID_INPUT);
        return scan.nextInt();
    }
}
