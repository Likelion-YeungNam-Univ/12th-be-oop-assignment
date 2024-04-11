import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 학생 관리 프로그램 ==");

        while (true) {
            System.out.print("입력: ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            }

            System.out.printf("입력받은 명령어 : %s\n", cmd);

        }
    }
}
