package domain;

public class Grade
{
    private int koreanGrade;
    private int englishGrade;
    private int mathGrade;

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
    public void setKoreanGrade(int koreanGrade){
        this.koreanGrade = koreanGrade;
    }
    public void setEnglishGrade(int englishGrade){
        this.englishGrade = englishGrade;
    }
    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }
}
