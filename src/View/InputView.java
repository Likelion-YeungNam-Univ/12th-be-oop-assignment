package View;

import java.util.Scanner;

public class InputView {
    private static final Scanner scan = new Scanner(System.in);
    private static final String MENU_BAR_INPUT = "기능 입력 : ";
    private static final String STUDENT_ID_INPUT = "학번 입력 : ";
    private static final String STUDENT_NAME_INPUT = "이름 입력 : ";
    private static final String KOREAN_GRADE_INPUT = "국어 입력 : ";
    private static final String ENGLISH_GRADE_INPUT = "영어 입력 : ";
    private static final String MATH_GRADE_INPUT = "수학 입력 : ";

    public static int readMenuBarCmd(){
        System.out.print(MENU_BAR_INPUT);
        return scan.nextInt();
    }

    public static int readStudentId(){
        System.out.print(STUDENT_ID_INPUT);
        return scan.nextInt();
    }

    public static String readStudentName(){
        System.out.print(STUDENT_NAME_INPUT);
        return scan.nextLine();
    }

    public static int readKoreanGrade(){
        System.out.print(KOREAN_GRADE_INPUT);
        return scan.nextInt();
    }
    public static int readEnglishGrade(){
        System.out.print(ENGLISH_GRADE_INPUT);
        return scan.nextInt();
    }
    public static int readMathGrade(){
        System.out.print(MATH_GRADE_INPUT);
        return scan.nextInt();
    }
}
