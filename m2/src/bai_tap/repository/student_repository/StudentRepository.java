package bai_tap.repository.student_repository;

import bai_tap.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> list;

    static {
        list = new ArrayList<>();
        Student s1 = new Student("MADARA", LocalDate.parse("2000-12-02"), "madara@goole.com", "0900398234", "c01");
        Student s2 = new Student("Itachi", LocalDate.parse("2001-11-12"), "itachi@goole.com", "093374723", "c02");
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
    public void removeStudent(int index) {
        list.remove(index);

    }

    @Override
    public void editStudent(int index,Student student) {
        list.set( index,student);
    }
}
