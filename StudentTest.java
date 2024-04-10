import java.util.*;

public class StudentTest {
    public static final StudentManage studentManage = new StudentManage();
    public static final Scanner scanner = new Scanner(System.in);
    public static String INIT_CTR =
                    "╔═════════════════════════════════════════════════╗\n" +
                    "║  student management program.                    ║\n" +
                    "║  0 : exit        1 : registration     2.search  ║\n" +
                    "║  3 : update      4 : remove           5.print   ║\n" +
                    "╚═════════════════════════════════════════════════╝";
    public static String UPDATE_CTR =
                    "╔════════════════════════════════════════════════════╗\n" +
                    "║  student update. - choose a update field           ║\n" +
                    "║  1 : name    2 : korea    3 : english    4 : math  ║\n" +
                    "╚════════════════════════════════════════════════════╝";

    public static String SORT_CTR =
                    "╔═════════════════════════════════════════════════════════════════╗\n" +
                    "║  student update. - choose a sorting method                      ║\n" +
                    "║  1 : id(desc)  2 : korea(asc)  3 : english(asc)  4 : math(asc)  ║\n" +
                    "╚═════════════════════════════════════════════════════════════════╝";
    public static String FORMAT = "%-8s%-15s%-10s%-10s%-10s%n";

    public static void main(String[] args) {
        init();
        while(true){
            System.out.println(INIT_CTR);
            try{
                int process = scanner.nextInt();
                if(process == 0) break;
                switch (process){
                    case 1 :
                        addForm();
                        break;
                    case 2 :
                        searchForm();
                        break;
                    case 3 :
                        updateForm();
                        break;
                    case 4 :
                        removeForm();
                        break;
                    case 5 :
                        printForm();
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("[Fail] input mismatch. try again");
                scanner.next();
            }catch (IllegalStateException e){
                System.out.println("[Fail] This student ID already exists.");
            }catch (NoSuchElementException e){
                System.out.println("[Fail] No student found with the student ID");
            }
        }

        scanner.close();
    }

    public static void addForm() throws InputMismatchException, IllegalStateException{
        System.out.println("════════════Student Registration════════════");

        //입력 InputMismatchException
        System.out.print("Student ID(number) : ");
        Long id = scanner.nextLong();
        System.out.print("Name[string]: ");
        String name = scanner.next();
        System.out.print("Korean Grade[number 0(default)-100]: ");
        int korea = scanner.nextInt();
        System.out.print("English Grade[number 0(default)-100]: ");
        int english = scanner.nextInt();
        System.out.print("Math Grade[number 0(default)-100]: ");
        int math = scanner.nextInt();
        Student student = new Student(id, name, korea, english, math);

        //추가 IllegalStateException
        studentManage.addStudent(student);

        //출력
        System.out.println("Registered Student");
        System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
        System.out.printf(studentManage.searchStudent(student.getId()).toString());
    }

    public static void searchForm() throws InputMismatchException, NoSuchElementException{
        System.out.println("════════════Search Student════════════");


        //입력 InputMismatchException
        System.out.print("student id to search : ");
        Long id = scanner.nextLong();

        //출력 NoSuchElementException
        System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
        System.out.printf(studentManage.searchStudent(id).toString());
    }

    public static void updateForm() throws InputMismatchException, NoSuchElementException{
        System.out.println("════════════Update Student════════════");

        //입력
        System.out.print("student id to update : ");
        Long id = scanner.nextLong();

        //원본출력 NoSuchElementException
        Student student = studentManage.searchStudent(id);
        System.out.println("ORIGIN");
        System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
        System.out.printf(student.toString());

        System.out.println(UPDATE_CTR);
        switch (scanner.nextInt()){
            case 1 : {
                System.out.print("new name[string]: ");
                String name = scanner.next();
                student.setName(name);
                break;
            }
            case 2 : {
                System.out.print("new koren grade[number 0(default)-100] : ");
                int korea = scanner.nextInt();
                student.setKorea(korea);
                break;
            }
            case 3 : {
                System.out.print("new english grade[number 0(default)-100]: ");
                int english = scanner.nextInt();
                student.setEnglish(english);
                break;
            }
            case 4 : {
                System.out.print("new math grade[number 0(default)-100] : ");
                int math = scanner.nextInt();
                student.setMath(math);
                break;
            }
        }
        studentManage.updateStudent(student);
        System.out.println("UPDATED");
        System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
        System.out.printf(studentManage.searchStudent(student.getId()).toString());
    }

    public static void removeForm() throws InputMismatchException, NoSuchElementException{
        System.out.println("════════════Remove Student════════════");

        //입력 InputMismatchException
        Long id = scanner.nextLong();
        System.out.print("student id to remove : ");

        //삭제 NoSuchElementException
        System.out.println("REMOVED");
        System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
        System.out.printf(studentManage.removeStudent(id).toString());
    }

    public static void printForm(){
        System.out.println("════════════Print Student════════════");
        StringBuilder sb = new StringBuilder();
        sort().forEach(student-> sb.append(student));

        if(sb.isEmpty()) {
            System.out.println("No student found");
            return;
        }
        System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
        System.out.printf(sb.toString());
    }

    static class DescId implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return (int) (o1.getId() - o2.getId());
        }
    }

    static class AscKorea implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getKorea() - o1.getKorea();
        }
    }

    static class AscEnglish implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getEnglish() - o1.getEnglish();
        }
    }

    static class AscMath implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getMath() - o1.getMath();
        }
    }

    public static List<Student> sort(){
        List<Student> studentList = new ArrayList<>(studentManage.getStudentList().values());
        System.out.println(SORT_CTR);
        switch (scanner.nextInt()){
            case 1:
                Collections.sort(studentList, new DescId());
                break;
            case 2:
                Collections.sort(studentList, new AscKorea());
                break;
            case 3:
                Collections.sort(studentList, new AscEnglish());
                break;
            case 4:
                Collections.sort(studentList, new AscMath());
                break;
        }
        return studentList;
    }
    public static void init(){
        studentManage.addStudent(new Student(1L, "Student1", 92, 45, 78));
        studentManage.addStudent(new Student(2L, "Student2", 30, 87, 62));
        studentManage.addStudent(new Student(3L, "Student3", 75, 91, 12));
        studentManage.addStudent(new Student(4L, "Student4", 63, 55, 84));
        studentManage.addStudent(new Student(5L, "Student5", 87, 76, 34));
        studentManage.addStudent(new Student(6L, "Student6", 42, 89, 55));
        studentManage.addStudent(new Student(7L, "Student7", 84, 22, 96));
        studentManage.addStudent(new Student(8L, "Student8", 76, 68, 73));
        studentManage.addStudent(new Student(9L, "Student9", 55, 87, 45));
        studentManage.addStudent(new Student(10L, "Student10", 91, 32, 88));
        studentManage.addStudent(new Student(11L, "Student11", 37, 74, 60));
        studentManage.addStudent(new Student(12L, "Student12", 80, 45, 92));
        studentManage.addStudent(new Student(13L, "Student13", 65, 53, 78));
        studentManage.addStudent(new Student(14L, "Student14", 82, 41, 66));
        studentManage.addStudent(new Student(15L, "Student15", 73, 84, 27));
        studentManage.addStudent(new Student(16L, "Student16", 50, 66, 83));
        studentManage.addStudent(new Student(17L, "Student17", 63, 69, 57));
        studentManage.addStudent(new Student(18L, "Student18", 72, 35, 91));
        studentManage.addStudent(new Student(19L, "Student19", 85, 78, 40));
        studentManage.addStudent(new Student(20L, "Student20", 46, 90, 72));
        studentManage.addStudent(new Student(21L, "Student21", 59, 42, 94));
        studentManage.addStudent(new Student(22L, "Student22", 79, 68, 61));
        studentManage.addStudent(new Student(23L, "Student23", 57, 80, 50));
        studentManage.addStudent(new Student(24L, "Student24", 64, 73, 65));
        studentManage.addStudent(new Student(25L, "Student25", 89, 57, 83));
    }
}
