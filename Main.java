import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();
    private static int lastStudentId = 0;

    public static void main(String[] args) {
        System.out.println("== 학생 관리 프로그램 ==");

        while (true) {
            System.out.print("입력: ");
            String cmd = scanner.nextLine();

            switch (cmd) {
                case "종료":
                    return;
                case "등록":
                    registerStudent();
                    break;
                case "목록 조회":
                    printStudentList();
                    break;
                case "검색":
                    searchStudent();
                    break;
                case "수정":
                    modifyStudent();
                    break;
                case "삭제":
                    deleteStudent();
                    break;
                default:
                    System.out.println("잘못된 명령어입니다.");
            }
        }
    }

    private static void registerStudent() {

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
        students.add(new Student(studentId, name, korGr, engGr, matGr));

        System.out.printf("%d번 학생이 등록되었습니다.\n", lastStudentId);
        scanner.nextLine(); // 버퍼 비우기
    }

    private static void printStudentList() {
        System.out.println("학번 / 이름 / 국어 성적 / 영어 성적 / 수학 성적");
        System.out.println("---------------------------------------");

        if (students.isEmpty())
            System.out.println("등록된 학생이 없습니다.");
        else {
            for (int i = students.size() - 1; i >= 0; i--) {
                Student student = students.get(i);
                System.out.printf("%s / %s / %d / %d / %d \n", student.studentId, student.name, student.korGr, student.engGr, student.matGr);
            }
        }
    }

    private static void searchStudent() {
        System.out.print("검색할 학생의 학번 또는 이름을 입력하세요: ");
        String keyword = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getStudentId().equals(keyword) || student.getName().equals(keyword)) {
                System.out.println("학번 / 이름 / 국어 성적 / 영어 성적 / 수학 성적");
                System.out.println("---------------------------------------");
                System.out.printf("%s / %s / %d / %d / %d\n", student.getStudentId(), student.getName(),
                        student.getKorGr(), student.getEngGr(), student.getMatGr());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학번 또는 이름을 가진 학생을 찾을 수 없습니다.");
        }
    }

    private static void modifyStudent() {
        System.out.print("수정할 학생의 학번을 입력하세요: ");
        String studentIdToModify = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentId().equals(studentIdToModify)) {
                System.out.println("수정할 정보를 입력하세요:");

                System.out.print("이름 : ");
                String name = scanner.next();
                student.setName(name);

                System.out.print("국어 성적 : ");
                int korGr = scanner.nextInt();
                student.setKorGr(korGr);

                System.out.print("영어 성적 : ");
                int engGr = scanner.nextInt();
                student.setEngGr(engGr);

                System.out.print("수학 성적 : ");
                int matGr = scanner.nextInt();
                student.setMatGr(matGr);

                System.out.println("학번이 " + studentIdToModify + "인 학생 정보가 수정되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학번을 가진 학생을 찾을 수 없습니다.");
        }
    }
    private static void deleteStudent() {
        System.out.print("삭제할 학생의 학번을 입력하세요: ");
        String studentIdToDelete = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentId().equals(studentIdToDelete)) {
                students.remove(i);
                System.out.println("학번이 " + studentIdToDelete + "인 학생 정보가 삭제되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학번을 가진 학생을 찾을 수 없습니다.");
        }
    }
}