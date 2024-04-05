import java.util.*;

public class Manage {

    private final Map<String, Student> students = new HashMap<>();  // 학생 정보 저장
    private static final Scanner sc = new Scanner(System.in);

    /* 학생 추가 */
    private void add(int stdNum, String name, int kor, int eng, int math) {

        Student student = new Student(stdNum, name, kor, eng, math);
        students.put(name, student);
        System.out.println(name + "학생 추가 완료");
    }

    /* 전체 학생 조회 */
    private void readAll() {

        System.out.println("학번       이름  국어  영어  수학  평균");

        for(String student: students.keySet()) {
            System.out.println(students.get(student));
        }
    }

    /* 특정 학생 정보 조회 메서드*/
    private void read(Student student) {

        System.out.println("학번       이름  국어  영어  수학  평균");
        System.out.println(student);
    }

    /* 학생 정보 업데이트 */
    private void update(Student student, int stdNum, String name, int kor, int eng, int math) {

        student.update(stdNum, name, kor, eng, math);
        System.out.println(student.getName() + "학생 정보 수정 성공");
    }

    /* 학생 정보 삭제 메서드 */
    private void delete(String name) {

        if(students.containsKey(name)) {
            students.remove(name);
            System.out.println(name + "학생 정보 삭제 성공");
        }
        else
            System.out.println("해당 학생이 존재하지 않습니다.");
    }


    /* HashMap에서 학생 정보 가져오기 */
    private Student getStudent(String name) {
        return students.get(name);
    }

    /* 학번 순으로 정렬 후 출력 */
    private void sortByStdNum() {

        List<Student> list = new ArrayList<>(students.values());

        Collections.sort(list, (s1, s2) -> Integer.compare(s1.getStdNum(), s2.getStdNum()));

        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

    /* 이름 순으로 정렬 후 출력*/
    private void sortByName() {
        List<Student> list = new ArrayList<>(students.values());

        Collections.sort(list, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

    /* 평균 순으로 정렬 후 출력 */
    private void sortByAvg() {

        List<Student> list = new ArrayList<>(students.values());

        Collections.sort(list, (s1, s2) -> Double.compare(s2.getAvg(), s1.getAvg()));

        for (Student student : list) {
            System.out.println(student.toString());
        }
    }


    /* 정보 입력 메서드 (추가, 업데이트) */
    private void inputInfo(String type, Student student) {
        System.out.print("학번 입력: ");
        int stdNum = sc.nextInt();

        System.out.print("이름 입력: ");
        String name = sc.next();

        System.out.print("국어 성적 입력: ");
        int kor = sc.nextInt();

        System.out.print("영어 성적 입력: ");
        int eng = sc.nextInt();

        System.out.print("수학 성적 입력: ");
        int math = sc.nextInt();

        switch (type) {
            case "add" -> add(stdNum, name, kor, eng, math);
            case "update" -> update(student, stdNum, name, kor, eng, math);
        }
    }

    /* 프로그램 실행 메서드 */
    public void run() {

        while (true) {
            System.out.println("1 : 학생 추가, 2: 학생 조회, 3: 전체 학생 조회, 4: 학생 정보 수정," +
                    " 5: 학생 정보 삭제, 6: 학번 순 정렬, 7: 이름 순 정렬, 8: 평균 순 정렬, 0: 종료");
            int select = sc.nextInt();
            if(select == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            switch (select) {
                case 1 -> {
                    inputInfo("add", null);
                }
                case 2 -> {
                    System.out.print("조회할 학생의 이름을 입력하세요: ");
                    String name = sc.next();
                    Student student = getStudent(name);

                    if (student == null) {
                        System.out.println("해당 학생은 존재하지 않습니다.");
                        continue;
                    }

                    read(student);
                }
                case 3 -> {
                    readAll();
                }

                case 4 -> {
                    System.out.print("수정할 학생의 이름을 입력하세요: ");
                    String name = sc.next();
                    Student student = getStudent(name);

                    if(student == null) {
                        System.out.println("해당 학생은 존재하지 않습니다.");
                        continue;
                    }

                    inputInfo("update", student);
                }
                case 5 -> {
                    System.out.print("삭제할 학생의 이름을 입력하세요: ");
                    String name = sc.next();

                    delete(name);
                }
                case 6 -> {
                    sortByStdNum();
                }
                case 7 -> {
                    sortByName();
                }
                case 8 -> {
                    sortByAvg();
                }
            }
        }
    }
}

