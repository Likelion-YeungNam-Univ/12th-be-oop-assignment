package Management;

import java.util.ArrayList;

public class Fetch {
    public static void fetchStudents(ArrayList<Student> students) {
        System.out.println("전체 학생 정보를 조회 합니다.");
        System.out.println("학번, 학생 이름, 국어 성적, 수학 성적, 영어 성적 순 입니다.");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
