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
            System.out.println("Registered Student: " + studentManage.searchStudent(student.getId()));
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
            System.out.println(studentManage.searchStudent(id));
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
            System.out.println("origin : " + student);

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
            System.out.println("update : " + studentManage.searchStudent(student.getId()));

        }catch (IllegalArgumentException e){
            System.out.println("No student found with the student ID");
        }
    }

    public static void removeForm(){
        System.out.println("Remove Student ");
        System.out.print("student id to remove : ");
        Long id = scanner.nextLong();

        try{
            System.out.println("removed : " + studentManage.removeStudent(id));
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
        System.out.println(studentManage.showStudent());
    }
}
