import java.io.*;
import java.util.ArrayList;

public class Management {
    private ArrayList<Student> students=new ArrayList<>();
    Management(){ load(); }

    // 학생 등록
    public void enroll(Student st){

        //텍파(db)쓰기
        try  {
            BufferedWriter w = new BufferedWriter(new FileWriter("DB.txt",true));
            w.write(st.getId() + "/" + st.getName() + "/"
                    + st.getK_score() + "/" + st.getE_score() + "/"
                    + st.getM_score());
            w.newLine();
            w.close();
            System.out.println("저장 완료");
            students.add(st);

        } catch (IOException e) {
            System.out.println("실패");
        }

    }
    public void load() {
        try {
            BufferedReader r = new BufferedReader(new FileReader("DB.txt"));
            String data;

            //db읽어오기
            while (true) {
                data=r.readLine();
                if(data==null){
                    break;
                }
                else{
                    String[] info = data.split("/");

                    String studentId = info[0];
                    String name = info[1];
                    int koreanScore = Integer.parseInt(info[2]);
                    int englishScore = Integer.parseInt(info[3]);
                    int mathScore = Integer.parseInt(info[4]);

                    Student student = new Student(studentId, name, koreanScore, englishScore, mathScore);
                    students.add(student);
                }

            }

        } catch (Exception e) {
            System.out.println("실패");
        }

    }
    public void printDb(){
        for (Student st: students){
            System.out.printf("학번: %s / 이름: %s / 국어점수: %d / 영어점수: %d / 수학점수: %d\n",
                    st.getId(),st.getName(),st.getK_score(),st.getE_score(),st.getM_score());
        }
    }
}
