package dto;

import constant.GradeConstant;
import domain.Grade;

public class GradeDTO {
    private final int koreanGrade;
    private final int englishGrade;
    private final int mathGrade;
    private double average;

    public GradeDTO(int koreanGrade, int englishGrade, int mathGrade){
        this.koreanGrade = koreanGrade;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        setAverage();
    }
    public GradeDTO(Grade grade){
        this.koreanGrade = grade.getKoreanGrade();
        this.englishGrade = grade.getEnglishGrade();
        this.mathGrade = grade.getMathGrade();
        setAverage();
    }
    public void setAverage() {
        this.average = (double)(koreanGrade + englishGrade + mathGrade) / GradeConstant.SUBJECT_CONUT;
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
    public double getAverage() {
        return average;
    }


}
