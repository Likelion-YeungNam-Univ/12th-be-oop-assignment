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

                Student student = new Student(studentId, name, korGr, engGr, matGr);
                students.add(student);

                System.out.printf("%d번 학생이 등록되었습니다.\n", lastStudentId);
            }
            else if (cmd.equals("목록 조회")) {

                System.out.println("학번 / 이름 / 국어 성적 / 영어 성적 / 수학 성적");

                System.out.println("---------------------------------------");

                if (students.isEmpty())
                    System.out.println("등록된 학생이 없습니다.");

                for (int i = students.size() - 1; i >= 0; i--) {
                    Student student = students.get(i);
                    System.out.printf("%s / %s / %d / %d / %d \n", student.studentId, student.name, student.korGr,student.engGr, student.matGr );
                }
            }
            else if (cmd.equals("삭제")) {
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
            else if (cmd.equals("수정")) {
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

            else if (cmd.equals("검색")) {
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

        }

    }

}
