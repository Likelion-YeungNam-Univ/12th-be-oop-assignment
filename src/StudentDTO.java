import lombok.Data;

@Data
public class StudentDTO {
    private String Id; // 등록번호
    private String studentId; // 학번
    private String name; // 이름
    private int koreanScore; // 국어 성적
    private int englishScore; // 영어 성적
    private int mathScore; // 수학 성적

    public StudentDTO() {
    }

    // 모든 필드를 인자로 받는 생성자 추가
    public StudentDTO(String studentId, String name, int koreanScore, int mathScore, int englishScore) {
        this.studentId = studentId;
        this.name = name;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }


}


