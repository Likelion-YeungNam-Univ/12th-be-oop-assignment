
import java.util.HashMap;
import java.util.Map;

public class StudentManage {
    private Map<Long, Student> studentList = new HashMap<Long, Student>();

    //1. 학생등록
    public void addStudent(Student student){
        studentList.put(student.getId(), student);
    }

    //2. 학생전체조회
    public String showStudent(){
        StringBuilder sb = new StringBuilder();
        studentList.forEach((id, student) -> sb.append(student.toString()).append("\n"));
        return sb.toString();
    }

    //3. 학생검색
    public Student searchStudent(Long id){
        return studentList.get(id);
    }

    //4. 학생정보수정
    public void updateStudent(Student student){
        studentList.put(student.getId(), student);
    }

    //5. 학생삭제
    public Student Student(Long id){
        return studentList.remove(id);
    }
}
