package bai_tap.repository.student_repository;

import bai_tap.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
     void addStudent(Student student);
     void removeStudent(int index);
     void editStudent(int index,Student student);
}
