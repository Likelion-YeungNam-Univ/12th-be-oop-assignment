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
                    //전체 조회
                    m.printDb();
                    break;
                case 3:
                    //학번으로 검색
                    System.out.print("학번을 입력하세요: ");
                    String searchId= scn.next();
                    m.search(searchId);
                    break;
                case 4:
                    //정보 수정
                    System.out.print("수정할 학생의 학번을 입력하세요: ");
                    String updateId = scn.next();
                    Student updateSt = m.search(updateId);

                    if (updateSt != null) {
                        System.out.println("수정할 항목을 고르세요");
                        System.out.println("1. 이름     2. 국어 성적    3. 영어 성적     4. 수학 성적");
                        int menu2=scn.nextInt();
                        switch (menu2){
                            case 1:
                                System.out.print("이름을 입력하세요: ");
                                String newName=scn.next();
                                updateSt.setName(newName);
                                break;
                            case 2:
                                System.out.print("국어 성적을 입력하세요: ");
                                int newKscore=scn.nextInt();
                                updateSt.setKscore(newKscore);
                                break;
                            case 3:
                                System.out.print("영어 성적을 입력하세요: ");
                                int newEscore=scn.nextInt();
                                updateSt.setEscore(newEscore);
                                break;
                            case 4:
                                System.out.print("수학 성적을 입력하세요: ");
                                int newMscore=scn.nextInt();
                                updateSt.setMscore(newMscore);
                                break;
                        }
                        m.update(updateSt);
                    }
                    break;
                case 5:
                    break;
                case 6:
                    //종료
                    System.out.println("종료");
                    break;

            }
        }
    }
}


