import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // 학생 정보를 저장할 ArrayList 생성
    // private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 관리 프로그램입니다. ");
        System.out.println("1번 : 학생 등록, 2번 : 전체 조회, 3번 : 학생 검색, 4번 : 학생 정보 수정, 5번 : 학생 삭제");

        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("1번: 학생 등록 기능입니다.");
                break;
            case 2:
                System.out.println("2번: 전체 조회 기능입니다.");
                break;
            case 3:
                System.out.println("3번: 학생 검색 기능입니다.");
                break;
            case 4:
                System.out.println("4번: 학생 정보 수정 기능입니다.");
                break;
            case 5:
                System.out.println("5번: 학생 삭제 기능입니다.");
                break;
        }
    }
}


