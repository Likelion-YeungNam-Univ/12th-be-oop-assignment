import java.util.Scanner;

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
                    "╔═════════════════════════════╗\n" +
                    "║  student update.            ║\n" +
                    "║  1 : name        2 : korea  ║\n" +
                    "║  3 : english     4 : math   ║\n" +
                    "╚═════════════════════════════╝";
    public static String FORMAT = "%-8s%-15s%-10s%-10s%-10s%n";

    public static void main(String[] args) {

        while(true){
            System.out.println(INIT_CTR);
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
        }

        scanner.close();
    }

    public static void addForm(){
        System.out.println("Student Registration ");
        System.out.print("Student ID : ");
        Long id = scanner.nextLong();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Korean Grade: ");
        int korea = scanner.nextInt();
        System.out.print("English Grade: ");
        int english = scanner.nextInt();
        System.out.print("Math Grade: ");
        int math = scanner.nextInt();

        Student student = new Student(id, name, korea, english, math);

        try{
            studentManage.addStudent(student);
            System.out.println("Registered Student");
            System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
            System.out.printf(studentManage.searchStudent(student.getId()).toString());
        }
        catch (IllegalArgumentException e){
            System.out.println("This student ID already exists.");
            return;
        }
    }

    public static void searchForm(){
        System.out.println("Search Student");
        System.out.print("student id to search : ");
        Long id = scanner.nextLong();

        try{
            System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
            System.out.printf(studentManage.searchStudent(id).toString());
        }catch (IllegalArgumentException e){
            System.out.println("No student found with the student ID");
        }
    }

    public static void updateForm(){
        System.out.println("Update Student");
        System.out.print("student id to update : ");
        Long id = scanner.nextLong();

        try{
            Student student = studentManage.searchStudent(id);
            System.out.println("ORIGIN");
            System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
            System.out.printf(student.toString());
            System.out.println(UPDATE_CTR);
            switch (scanner.nextInt()){
                case 1 : {
                    System.out.print("new name: ");
                    String name = scanner.next();
                    student.setName(name);
                    break;
                }
                case 2 : {
                    System.out.print("new koren grade : ");
                    int korea = scanner.nextInt();
                    student.setKorea(korea);
                    break;
                }
                case 3 : {
                    System.out.print("new english grade : ");
                    int english = scanner.nextInt();
                    student.setEnglish(english);
                    break;
                }
                case 4 : {
                    System.out.print("new math grade : ");
                    int math = scanner.nextInt();
                    student.setMath(math);
                    break;
                }
            }
            studentManage.updateStudent(student);
            System.out.println("UPDATED");
            System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
            System.out.printf(studentManage.searchStudent(student.getId()).toString());

        }catch (IllegalArgumentException e){
            System.out.println("No student found with the student ID");
        }
    }

    public static void removeForm(){
        System.out.println("Remove Student ");
        System.out.print("student id to remove : ");
        Long id = scanner.nextLong();

        try{
            System.out.println("REMOVED");
            System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
            System.out.printf(studentManage.removeStudent(id).toString());
        }catch (IllegalArgumentException e){
            System.out.println("No student found with the student ID");
        }
    }

    public static void printForm(){
        System.out.println("Print Student ");
        String studentList = studentManage.showStudent();
        if(studentList.isEmpty()) {
            System.out.println("No student found");
            return;
        }
        System.out.printf(FORMAT, "ID", "NAME", "KOREA", "ENGLISH", "MATH");
        System.out.printf(studentManage.showStudent());
    }
}
