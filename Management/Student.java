package Management;
import Management.Register;

public class Student {
    private String studentId;
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    // 생성자 추가
    public Student(String studentId, String name, int koreanScore, int englishScore, int mathScore) {
        this.studentId = studentId;
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
    // Getter and setter methods
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "학번: " + studentId + ", 이름: " + name + ", 국어 성적: " + koreanScore + ", 영어 성적: " + englishScore + ", 수학 성적: " + mathScore;
    }
}
