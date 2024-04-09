import lombok.Data;

@Data
public class StudentDTO {
    private String Id; // 등록번호
    private String studentId; // 학번
    private String name; // 이름
    private int koreanScore; // 국어 성적
    private int englishScore; // 영어 성적
    private int mathScore; // 수학 성적

}


