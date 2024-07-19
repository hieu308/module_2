package bai_tap.service.student_service;

import bai_tap.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void addStudent(Student student);

    void editStudent(int index, Student student);

    Student removeStudent(int index);
}
