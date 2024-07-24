package quang_ly_code_gym.repository.student_repository;

import quang_ly_code_gym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();

    void addStudent(Student student);

    void removeStudent(int id);

    Student checkId(int id);



  void editStudent(int index, Student student);
    public void sortStudentsAscendingByName();
    public void sortStudentsAscendingById();
}
