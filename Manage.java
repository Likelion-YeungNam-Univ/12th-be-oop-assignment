import java.util.HashMap;
import java.util.Map;

public class Manage {

    private final Map<String, Student> students = new HashMap<>();  // 학생 정보 저장

    /* 학생 추가 */
    private void add(int stdNum, String name, int kor, int eng, int math) {

        Student student = new Student(stdNum, name, kor, eng, math);
        students.put(name, student);
        System.out.println(name + "학생 추가 완료");
    }

    /* 전체 학생 조회 */
    private void readAll() {

        System.out.println("학번       이름  국어  영어  수학  평균");

        for(String student: students.keySet()) {
            System.out.println(students.get(student));
        }
    }

}
