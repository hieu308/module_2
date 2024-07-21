package quang_ly_code_gym.repository.student_repository;

import quang_ly_code_gym.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> list;

    static {
        list = new ArrayList<>();
        Student s1 = new Student(123, "MADARA", LocalDate.parse("2000-12-02"), "madara@goole.com", "0900398234", "c01");
        Student s2 = new Student(441, "Itachi", LocalDate.parse("2001-11-12"), "itachi@goole.com", "093374723", "c02");
        list.add(s1);
        list.add(s2);

    }

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public List<Student> findAll() {
        return list;
    }


    @Override
    public void removeStudent(int index ) {
        list.remove(index);

    }

    public StudentRepository() {
        super();
    }

    @Override
    public Student checkId(int id) {
        for (Student student : list) {
            if (student.getId() == id) {
                return student;

            }
        }
        System.out.println("không tìm thấy id ");
        return null;
    }

    @Override
    public int getIndex(Student student) {
        return list.indexOf(student);
    }

    @Override
    public void editStudent(int index, Student student) {
        list.set(index, student);
    }
}
