import java.util.Scanner;

public class StudentTest {
    public static final StudentManage studentManage = new StudentManage();
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            int process = scanner.nextInt();
            if(process == 0) break;
            switch (process){
                case 1 :
                    addForm();
                    break;
                case 2 :
                    searchForm();
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

        if(studentManage.isExists(student.getId())) {
            System.out.println("This student ID already exists.");
            return;
        }

        studentManage.addStudent(student);
        System.out.println("Registered Student: " + studentManage.searchStudent(student.getId()));
    }

    public static void searchForm(){
        System.out.println("Search Student");
        System.out.print("student id to search : ");
        Long id = scanner.nextLong();

        try{
            System.out.println(studentManage.searchStudent(id));
        }catch (IllegalArgumentException e){
            System.out.println("No student found with the student ID");
        }
    }
}
