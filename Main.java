import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        // 학생을 추가할 classRoom 생성
        StudentList classRoom = new StudentList();
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 학생 관리 프로그램을 시작합니다. =====");
        System.out.println();
        int option = 0;
        while (true) {
            System.out.println("================================");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 검색");
            System.out.println("3. 학생 전체 조회");
            System.out.println("4. 학생 정보 수정");
            System.out.println("5. 학생 삭제");
            System.out.println("================================");
            System.out.print("메뉴를 입력하세요. (* 종료를 원한다면 -1을 입력하세요.) : ");
            option = sc.nextInt();

            if (option == -1) break;

            if (option == 1) {
                String stId, nm;
                int kor, eng, math;
                System.out.println("학생을 등록합니다. 다음의 정보를 입력해주세요.");
                System.out.print("학번: ");
                stId = sc.next();

                System.out.print("이름: ");
                nm = sc.next();

                System.out.print("국어 성적 (성적이 정보가 없다면 0을 입력하세요.): ");
                kor = sc.nextInt();

                System.out.print("영어 성적 (성적이 정보가 없다면 0을 입력하세요.): ");
                eng = sc.nextInt();

                System.out.print("수학 성적 (성적이 정보가 없다면 0을 입력하세요.): ");
                math = sc.nextInt();

                // 학생 객체 생성 후 classRoom에 추가.
                Student st = new Student(stId, nm, kor, eng, math);
                classRoom.addStudent(st);
            } else if (option == 2) {
                String stId, nm;
                System.out.println("검색하고자 하는 학생의 학번과 이름을 입력해주세요.");
                System.out.print("학번 (학번이 기억나지 않는다면 -1 입력): "); stId = sc.next();
                System.out.print("이름 (이름이 기억나지 않는다면 -1 입력): "); nm = sc.next();

                boolean isStIdEqual = stId.equals("-1");
                boolean isNameEqual = nm.equals("-1");

                if (isStIdEqual && isNameEqual ) {
                    System.out.println("어떤 정보도 입력하지 않았기 때문에 검색이 불가능합니다.");
                } else if (isNameEqual) {
                    classRoom.searchByStId(stId, 0);
                } else if (isStIdEqual) {
                    classRoom.searchByName(nm, 0);
                } else {
                    classRoom.searchByInfo(stId, nm, 0);
                }
            } else if (option == 3) {
                classRoom.searchAllStudents();
            } else if (option == 4) {
                System.out.println("수정하고자 하는 학생의 학번과 이름을 입력해주세요.");
                System.out.print("학번: "); String stId = sc.next();
                System.out.print("이름: "); String nm = sc.next();
                System.out.println("수정하고자 하는 정보를 입력해주세요. (성적의 경우 미변경시 -1 입력)");
                int newKor = -1, newEng = -1, newMath = -1;
                String newName;
                System.out.print("(미변경시 기존 이름 그대로 입력) - 이름: "); newName = sc.next();
                System.out.print("(미변경시 -1 입력) - 국어 성적: "); newKor = sc.nextInt();
                System.out.print("(미변경시 -1 입력) - 영어 성적: "); newEng = sc.nextInt();
                System.out.print("(미변경시 -1 입력) - 수학 성적: "); newMath = sc.nextInt();
                classRoom.updateStudent(stId, nm, newName, newKor, newEng, newMath);
            } else if (option == 5) {
                String delStId, delName;
                System.out.println("삭제하고자 하는 학생의 학번과 이름을 입력해주세요.");
                System.out.print("학번: "); delStId = sc.next();
                System.out.print("이름: "); delName = sc.next();

                classRoom.deleteStudent(delStId, delName);
            }
        }
    }
}
