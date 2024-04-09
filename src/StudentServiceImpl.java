import java.util.List;

public interface StudentServiceImpl {
    void addStudent(StudentDTO student); // 학생 등록
    List<StudentDTO> getAllStudents(); // 학생 전체 조회
    StudentDTO searchStudent(String studentId); // 학생 검색
    void updateStudent(StudentDTO student); // 학생 정보 수정
    void deleteStudent(String studentId); // 학생 삭제

}
