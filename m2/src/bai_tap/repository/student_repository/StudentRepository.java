package bai_tap.repository.student_repository;

import bai_tap.model.Student;

import java.time.LocalDate;

public class StudentRepository implements IStudentRepository {
    private static Student[] list;

    static {
        list = new Student[5];
        Student s1 = new Student("MADARA", LocalDate.parse("2000-12-02"),"madara@goole.com","0900398234","c01");
        Student s2 = new Student("Itachi", LocalDate.parse("2001-11-12"),"madara@goole.com","093374723","c02");
        list[0] = s1;
        list[1] = s2;
    }
    @Override
    public Student[] findAll() {
        return list;
    }
}
