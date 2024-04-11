import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 학생 관리 프로그램 ==");

        int lastStudentId = 0;
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.print("입력: ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            }
            else if (cmd.equals("등록")) {
                System.out.print("학번 : ");
                String studentId = scanner.nextLine();

                System.out.print("이름 : ");
                String name = scanner.next();

                System.out.print("국어 성적 : ");
                int korGr = scanner.nextInt();

                System.out.print("영어 성적 : ");
                int engGr = scanner.nextInt();

                System.out.print("수학 성적 : ");
                int matGr = scanner.nextInt();

                lastStudentId++;
                int id = lastStudentId;

                Student student = new Student(studentId, name, korGr, engGr,matGr);
                students.add(student);

                System.out.printf("%d번 학생이 등록되었습니다.\n", lastStudentId);
            }
            else if (cmd.equals("목록")) {
                System.out.println("총 학생 수 : " + students.size());
            }
        }
    }
}
