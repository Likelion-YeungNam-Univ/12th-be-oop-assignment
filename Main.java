import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Management m = new Management();
        Scanner scn = new Scanner(System.in);
        int menu=0;
        while(menu!=6){

            System.out.println("1. 학생 등록    2. 학생 전체 조회     3. 학생 검색    4. 학생 정보 수정     5. 학생 삭제    6. 그만");
            menu = scn.nextInt();

            switch (menu) {
                case 1:
                    //학생등록
                    System.out.print("학번을 입력하세요: ");
                    String studentId = scn.next();
                    System.out.print("이름을 입력하세요: ");
                    String name = scn.next();
                    System.out.print("국어 성적을 입력하세요: ");
                    int koreanScore = scn.nextInt();
                    System.out.print("영어 성적을 입력하세요: ");
                    int englishScore = scn.nextInt();
                    System.out.print("수학 성적을 입력하세요: ");
                    int mathScore = scn.nextInt();

                    Student st = new Student(studentId, name, koreanScore, englishScore, mathScore);
                    m.enroll(st);

                    break;
                case 2:
                    m.printDb();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("종료");
                    break;

            }
        }
    }
}


