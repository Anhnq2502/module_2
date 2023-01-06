package ss5_static_access_modifier.baitap;

public class StudentTest {
    public static void main(String[] args) {
        Student students = new Student();
        System.out.println(students);
        Student students1 = new Student("Lloyd", "Pro");
        System.out.println(students1);
    }
}
