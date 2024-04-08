

public class Student {
    private Long id;
    private String name;
    private int korea;
    private int english;
    private int math;

    public Student(Long id, String name, int korea, int english, int math) {
        this.id = id;
        this.name = name;
        this.korea = korea;
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        return sb.append(getId()).append("\t")
                .append(getName()).append("\t")
                .append(getKorea()).append("\t")
                .append(getEnglish()).append("\t")
                .append(getMath())
                .toString();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getKorea() {
        return korea;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKorea(int korea) {
        this.korea = korea;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
