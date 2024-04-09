import java.util.ArrayList;
import java.util.List;



public class StudentService implements StudentServiceImpl {
    private List<StudentDTO> students = new ArrayList<>();
    @Override
    public void addStudent(StudentDTO student) {

        int newId = students.size();
        student.setId(String.valueOf(newId)); // 학생 객체에 등록번호 설정
        students.add(student); // 학생 목록에 학생 객체 추가
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return students; // 직접 내부 리스트 반환
    }

    @Override
    public StudentDTO searchStudent(String studentId)  {
        for (StudentDTO student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(StudentDTO updatedStudent) {
        for (StudentDTO student : students) {
            if (student.getStudentId().equals(updatedStudent.getStudentId())) {
                // 학번이 일치하는 학생을 찾았다면, 이름, 국어 점수, 수학 점수를 업데이트합니다.
                student.setName(updatedStudent.getName());
                student.setKoreanScore(updatedStudent.getKoreanScore());
                student.setMathScore(updatedStudent.getMathScore());
                System.out.println("학생 정보가 업데이트되었습니다.");
                return;
            }
        }
        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
    }


    @Override
    public void deleteStudent(String studentId) {

    }
}
