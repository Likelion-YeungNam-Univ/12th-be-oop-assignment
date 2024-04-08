package repository;

import domain.Student;
import dto.StudentDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StudentsRepository {

    public static final Map<Integer, Student> students = new ConcurrentHashMap<>();

    public void save(Student student){
        students.put(student.getStdId(), student);
    }

    public Student findById(int searchStdId) {
        return students.get(searchStdId);
    }

    public List<StudentDTO> findAll(){
        List<StudentDTO> studentsDTO= new ArrayList<>();
        for (Map.Entry<Integer, Student> entrySet : students.entrySet()) {
            studentsDTO.add(new StudentDTO(entrySet.getValue()));
        }
        return studentsDTO;
    }

    public void delete(int stdId){
        students.remove(stdId);
    }
}
