import java.io.*;
import java.util.ArrayList;

public class Management {
    private ArrayList<Student> students=new ArrayList<>();
    Management(){}

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

}
