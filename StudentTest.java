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
}
