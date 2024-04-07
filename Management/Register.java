package Management;

import java.util.Scanner;
import java.util.ArrayList;

public class Register {
    public static void registerStudent(Scanner sc, ArrayList<Student> students) {
        System.out.println("학번, 이름, 국어 성적, 영어 성적, 수학 성적을 순서대로 입력해주세요.");
        String studentId = sc.next(); // 학번
        String name = sc.next(); // 이름
        int koreanScore = sc.nextInt(); // 국어 성적
        int englishScore = sc.nextInt(); // 영어 성적
        int mathScore = sc.nextInt(); // 수학 성적

        // 중복된 학번이 있는지 확인
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentId().equals(studentId)) {
                System.out.println("이미 등록된 학번입니다. 다시 입력 해주세요.");
                return;
            }
        }

        // 입력 받은 정보로 학생 객체 생성 후 리스트에 추가
        Student student = new Student(studentId, name, koreanScore, englishScore, mathScore);
        students.add(student);

        System.out.println("학생 등록이 완료되었습니다.");
    }

}
