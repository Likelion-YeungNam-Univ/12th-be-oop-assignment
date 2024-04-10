
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class StudentManage {
    private Map<Long, Student> studentList = new HashMap<Long, Student>();

    //1. 학생등록
    public void addStudent(Student student){
        if(isExists(student.getId())) throw new IllegalStateException();
        studentList.put(student.getId(), student);
    }

    //2. 학생전체조회
    public Map<Long, Student> getStudentList() {
        return studentList;
    }

    //3. 학생검색
    public Student searchStudent(Long id){
        Student student = studentList.get(id);
        if(student == null) throw new NoSuchElementException();
        return student;
    }

    //4. 학생정보수정
    public void updateStudent(Student student){
        studentList.put(student.getId(), student);
    }

    //5. 학생삭제
    public Student removeStudent(Long id){
        if(!isExists(id)) throw new NoSuchElementException();
        return studentList.remove(id);
    }

    public Boolean isExists(Long id){
        Student student = studentList.get(id);
        if(student == null) return false;
        return true;
    }
}
