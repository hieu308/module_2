package bai_tap;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("goku", LocalDate.of(2024,4,13), "goku@gmail.com", "0905588598", "giáo viên");
        System.out.println(teacher);
        teacher.say();
        teacher.teachFor("Lập trình");
        Student student = new Student("tề thiên", LocalDate.of(2022,3,11),"tethien@gmail.com","0777262744","mầmnon");
        System.out.println(student);
        student.say();
        student.learn("java");
    }
}
