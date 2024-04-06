package domain;

public class Grade
{
    private final int koreanGrade;
    private final int englishGrade;
    private final int mathGrade;

    public Grade(int koreanGrade, int englishGrade, int mathGrade){
        this.koreanGrade = koreanGrade;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getKoreanGrade() {
        return koreanGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }
}
