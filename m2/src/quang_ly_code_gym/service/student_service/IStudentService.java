package quang_ly_code_gym.service.student_service;

import quang_ly_code_gym.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void addStudent(Student student);

    void removeStudent(int index);

    Student checkId(int id);


    void editStudent(int index, Student student);

    void sortStudentsAscendingByName();

    void sortStudentsAscendingById();
}
