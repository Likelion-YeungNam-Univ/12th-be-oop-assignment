package domain;

import constant.GradeConstant;

public class Grade
{
    private int koreanGrade;
    private int englishGrade;
    private int mathGrade;
    private double average;
    public Grade(int koreanGrade, int englishGrade, int mathGrade){
        this.koreanGrade = koreanGrade;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        setAverage();
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

    public void setAverage() {
        this.average = (double)(koreanGrade + englishGrade + mathGrade) / GradeConstant.SUBJECT_CONUT;
    }

    public void setKoreanGrade(int koreanGrade) {
        this.koreanGrade = koreanGrade;
        setAverage();
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
        setAverage();
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
        setAverage();
    }
}
