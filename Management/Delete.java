package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    public static void deleteStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 학생의 학번을 입력하세요:");
        String deleteId = sc.next();

        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentId().equals(deleteId)) {
                students.remove(student);
                System.out.println("학생 정보가 삭제되었습니다.");
                found = true;
                break;
            }
        }

        // 학번을 잘못 입력한 경우
        if (!found) {
            System.out.println("해당 학번을 가진 학생이 존재하지 않습니다.");
        }
    }
}