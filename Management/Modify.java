package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class Modify {
    public static void modifyStudent(ArrayList<Student> students, Scanner sc) {
        System.out.println("수정할 학생의 학번을 입력해주세요:");

        String modifyId = sc.next();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentId().equals(modifyId)) {
                System.out.println("수정할 정보를 입력해주세요.");

                System.out.print("이름: ");
                student.setName(sc.next());

                System.out.print("국어 성적: ");
                student.setKoreanScore(sc.nextInt());

                System.out.print("영어 성적: ");
                student.setEnglishScore(sc.nextInt());

                System.out.print("수학 성적: ");
                student.setMathScore(sc.nextInt());

                System.out.println("학생 정보가 수정되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학번을 가진 학생이 존재하지 않습니다.");
        }
    }
}
