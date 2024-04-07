package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void searchStudent(Scanner sc, ArrayList<Student> students) {
        System.out.println("학번으로 학생의 정보를 조회 합니다.");
        System.out.println("조회할 학생의 학번을 입력 해주세요:"); // 학번으로 조회

        String searchId = sc.next();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentId().equals(searchId)) {
                System.out.println("검색된 학생 정보입니다. (학번, 이름, 국어 성적, 영어 성적, 영어 성적 순)");
                System.out.println(student);
                found = true;
                break;
            }
        }

        // 학번을 잘못 입력한 경우
        if (!found) {
            System.out.println("학번을 잘못 입력 하셨습니다.");
        }
    }
}
