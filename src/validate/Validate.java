package validate;

import view.ErrorView;
import constant.GradeConstant;
import constant.ValidConstant;
import domain.Grade;
import domain.Student;
import repository.StudentsRepository;

public class Validate {
    public static void isValidStudentNumber(String stdID) {
        if (!stdID.matches(ValidConstant.STDID_REGEX)) {
            throw new IllegalArgumentException(ErrorView.STUDENT_ID_IS_EIGHT_NUMBER);
        }
    }

    public static void isValidStudentGrade(Grade grade) {
        int koreanGrade = grade.getKoreanGrade();
        int englishGrade = grade.getEnglishGrade();
        int mathGrade = grade.getMathGrade();
        if (koreanGrade < GradeConstant.MIN_GRADE || koreanGrade > GradeConstant.MAX_GRADE || englishGrade < GradeConstant.MIN_GRADE ||
                englishGrade > GradeConstant.MAX_GRADE || mathGrade < GradeConstant.MIN_GRADE || mathGrade > GradeConstant.MAX_GRADE) {
            throw new IllegalArgumentException(ErrorView.OUT_OF_RANGE_GRADE);
        }
    }

    public static void isValidCmd(String cmd) {
        if(!cmd.matches(ValidConstant.INPUT_REGEX)){
            throw new IllegalArgumentException(ErrorView.NOT_VALID_INPUT_CMD);
        }
    }

    public static void isValidStudent(Student student) {
        if(student==null) {throw new IllegalArgumentException(ErrorView.NOT_FOUND);}
    }

    public static void isDupStudent(StudentsRepository studentRepository, Student student) {
        if(studentRepository.findById(student.getStdId())!=null){
            throw new IllegalArgumentException(ErrorView.DUP_STUDENT);
        }
    }
}
