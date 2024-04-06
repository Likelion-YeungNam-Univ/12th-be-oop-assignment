import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    // 기본 생성자 - 학번, 이름
    Student(String stId, String nm) {
        this.studentId = stId;
        this.name = nm;
    }

    // ------------
    // 학번 조회
    public String getStudentId() { return this.studentId; }

    // 이름 확인
    public String getName() { return this.name; }

    // 국어 성적 조회
    public int getKorScore() { return this.korScore; }

    // 영어 성적 조회
    public int getEngScore() { return this.engScore; }

    // 수학 성적 조회
    public int getMathScore() { return this.mathScore; }

    // 국어, 영어, 수학 평균 성적 조회
    public double getAverage() {
        double avg = (this.korScore + this.engScore + this.mathScore) / 3;
        return avg;
    }
    // ------------

    // ------------
    // 국어 성적 입력
    public void setKorScore(int kor) {
        this.korScore = kor;
        System.out.println(this.name + " 학생의 국어 성적" + kor + "점 입력이 완료되었습니다.");
    }
    // 영어 성적 입력

    public void setEngScore(int eng) {
        this.engScore = eng;
        System.out.println(this.name + "학생의 영어 성적" + eng + "입력이 완료되었습니다.");
    }
    // 수학 성적 입력
    public void setMathScore(int math) {
        this.mathScore = math;
        System.out.println(this.name + "학생의 수학 성적" + math + "입력이 완료되었습니다.");
    }

    // 성적 일괄 입력
    public void setSubjectScore(int kor, int eng, int math) {
        this.setKorScore(kor);
        this.setEngScore(eng);
        this.setMathScore(math);
    }
    // ------------


    // ------------
    // 학생 정보 출력
    public void printStudent() {
        System.out.println("학번: " + this.studentId + ", 이름: " + this.name + "의 정보를 조회합니다.");
        System.out.println("국어 성적: " + this.korScore + ", 영어 성적: " + this.engScore + ", 수학 성적: " + this.mathScore);
    }

    // 학생 국어 성적 출력
    public void printKor() { System.out.println(this.name + " 학생의 국어 성적은 " + this.korScore + "점 입니다." ); }

    // 학생 영어 성적 출력
    public void printEng() { System.out.println(this.name + " 학생의 영어 성적은 " + this.engScore + "점 입니다." ); }

    // 학생 수학 성적 출력
    public void printMath() { System.out.println(this.name + " 학생의 수학 성적은 " + this.mathScore + "점 입니다." ); }
    // ------------



}