import java.util.ArrayList;
import java.util.List;



public class StudentService implements StudentServiceImpl {
    private static int currentId = 0; // 등록번호를 위한 변수
    private List<StudentDTO> students = new ArrayList<>();
    @Override
    public void addStudent(StudentDTO student) {

        currentId++; // 학생을 추가할 때마다 등록번호를 1 증가
        student.setId(String.valueOf(currentId)); // 학생 객체에 등록번호 설정
        students.add(student);
        System.out.println("학생이 성공적으로 등록되었습니다.");
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return students; // 직접 내부 리스트 반환
    }

    @Override
    public StudentDTO searchStudent(String studentId) {
        return null;
    }

    @Override
    public void updateStudent(StudentDTO student) {

    }

    @Override
    public void deleteStudent(String studentId) {

    }
}
