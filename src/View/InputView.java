package View;

import java.util.Scanner;

public class InputView {
    private static final String MENU_BAR_INPUT = "기능 입력 : ";
    private static final String STUDENT_ID_INPUT = "학번 입력 : ";
    private static final String STUDENT_NAME_INPUT = "이름 입력 : ";
    private static final String KOREAN_GRADE_INPUT = "국어 입력 : ";
    private static final String ENGLISH_GRADE_INPUT = "영어 입력 : ";
    private static final String MATH_GRADE_INPUT = "수학 입력 : ";

    public static int readMenuBarCmd(Scanner scan){
        System.out.print(MENU_BAR_INPUT);
        return scan.nextInt();
    }

    public static int readStudentId(Scanner scan){
        System.out.print(STUDENT_ID_INPUT);
        int stdId =  scan.nextInt();
        scan.nextLine();
        return stdId;
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
}
