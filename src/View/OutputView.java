package View;

public class OutputView {
    private static final String MENU_BAR_MSG = "1. 학생 등록, 2. 학생 전체 조회, 3. 학생 검색, 4. 학생 정보 수정, 5. 학생 삭제, 6. 종료";
    private static final String EXIT_MSG  = "프로그램을 종료합니다.";
    private static final String WRONG_CMD_MSG = "잘못된 입력입니다.";
    public static void printMenuBar(){
        System.out.println(MENU_BAR_MSG);
    }

    public static void printExit(){
        System.out.println(EXIT_MSG);
    }
    public static void printWrong(){
        System.out.println(WRONG_CMD_MSG);
    }
}
