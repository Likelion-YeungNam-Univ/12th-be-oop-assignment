package repository;

import domain.Student;
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

    public Map<Integer, Student> findAll(){
        return students;
    }

    public void delete(Student student){
        students.remove(student.getStdId());
    }
}
