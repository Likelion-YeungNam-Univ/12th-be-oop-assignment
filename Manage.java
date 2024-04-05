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

}
