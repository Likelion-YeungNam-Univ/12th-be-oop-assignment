//학생 클래스
public class Student {

    private String id;
    private String name;
    private int k_score;
    private int e_score;
    private int m_score;

    Student() {}

//학생 등록
    Student(String id, String name, int k_score, int e_score, int m_score){
        this.id=id;
        this.name=name;
        this. k_score= k_score;
        this. e_score= e_score;
        this. m_score=m_score;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getK_score() {
        return k_score;
    }
    public int getE_score() {return e_score;}
    public int getM_score() {
        return m_score;
    }


}
