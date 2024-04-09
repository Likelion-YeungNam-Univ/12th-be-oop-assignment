import java.util.ArrayList;
import java.util.List;



public class StudentService implements StudentServiceImpl {
    private List<StudentDTO> students = new ArrayList<>();
    @Override
    public void addStudent(StudentDTO student) {

        int newId = students.size();
        student.setId(String.valueOf(newId));
        students.add(student);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return students;
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

        for (int i = students.size() - 1; i >= 0; i--) {
            StudentDTO student = students.get(i);
            if (student.getStudentId().equals(studentId)) {
                students.remove(i);
                System.out.println(studentId + " 학번을 가진 학생이 성공적으로 삭제되었습니다.");
                return;
            }
        }
        System.out.println(studentId + " 학번을 가진 학생을 찾을 수 없습니다.");

    }
}
