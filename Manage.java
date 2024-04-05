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

    /* 특정 학생 정보 조회 메서드*/
    private void read(Student student) {

        System.out.println("학번       이름  국어  영어  수학  평균");
        System.out.println(student);
    }

    /* 학생 정보 업데이트 */
    private void update(Student student, int kor, int eng, int math) {

        student.update(kor, eng, math);
        System.out.println(student.getName() + "학생 정보 수정 성공");
    }



    /* HashMap에서 학생 정보 가져오기 */
    private Student getStudent(String name) {
        return students.get(name);
    }


}
