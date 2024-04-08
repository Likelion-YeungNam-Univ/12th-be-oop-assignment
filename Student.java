//학생 클래스
public class Student {

    private String id;
    private String name;
    private int k_score;
    private int e_score;
    private int m_score;

    Student() {}

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
    public void setId(String id){
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public int getKscore() {
        return k_score;
    }
    public int getEscore() {return e_score;}
    public int getMscore() {
        return m_score;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setKscore(int k_score){
        this.k_score=k_score;
    }
    public void setEscore(int e_score){
        this.e_score=e_score;
    }
    public void setMscore(int m_score){
        this.m_score=m_score;
    }

}
