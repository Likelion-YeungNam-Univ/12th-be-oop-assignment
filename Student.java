public class Student {

    private int stdNum;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private double avg;

    public Student(int stdNum, String name, int kor, int eng, int math) {
        this.stdNum = stdNum;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.avg = (double) (kor + eng + math) / 3;
    }

    public int getStdNum() {
        return stdNum;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public double getAvg() {
        return avg;
    }

    public void update(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String toString() {
        return getStdNum() + " " + getName() + "  " + getKor() + "   " + getEng() + "   " + getMath() + "  " + getAvg();
    }
}
