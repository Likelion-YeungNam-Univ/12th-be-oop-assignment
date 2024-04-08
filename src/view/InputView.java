package view;

import java.util.Scanner;

public class InputView {
    private static final String MENU_BAR_INPUT = "원하는 서비스 선택 : ";
    private static final String STUDENT_ID_INPUT = "학번 입력 : ";
    private static final String STUDENT_NAME_INPUT = "이름 입력 : ";
    private static final String KOREAN_GRADE_INPUT = "국어성적 입력 : ";
    private static final String ENGLISH_GRADE_INPUT = "영어성적 입력 : ";
    private static final String MATH_GRADE_INPUT = "수학성적 입력 : ";
    private static final String EDIT_LIST = "수정항목 선택\n1. 이름, 2. 국어성적, 3. 영어성적, 4. 수학성적, 5. 메인메뉴 이동";

    public static String readMenuBarCmd(Scanner scan){
        System.out.print(MENU_BAR_INPUT);
        return scan.nextLine();
    }

    public static String readStudentID(Scanner scan){
        System.out.print(STUDENT_ID_INPUT);
        return scan.nextLine();
    }

    public static String readStudentName(Scanner scan){
        System.out.print(STUDENT_NAME_INPUT);
        return scan.nextLine();
    }
    public static String readKoreanGrade(Scanner scan){
        System.out.print(KOREAN_GRADE_INPUT);
        return scan.nextLine();
    }
    public static String readEnglishGrade(Scanner scan){
        System.out.print(ENGLISH_GRADE_INPUT);
        return scan.nextLine();
    }

    public static String readMathGrade(Scanner scan){
        System.out.print(MATH_GRADE_INPUT);
        return scan.nextLine();
    }
    public static String readEditCmd(Scanner scan){
        System.out.println(EDIT_LIST);
        return scan.nextLine();
    }

}
