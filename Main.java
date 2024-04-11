import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 학생 관리 프로그램 ==");

        int lastStudentId = 0;

        while (true) {
            System.out.print("입력: ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            }
            else if (cmd.equals("등록")) {
                System.out.print("학번 : ");
                String id = scanner.nextLine();

                System.out.print("이름 : ");
                String name = scanner.nextLine();
                lastStudentId++;

                System.out.printf("%d번 학생이 등록되었습니다.\n", lastStudentId);

            }
        }
    }
}
