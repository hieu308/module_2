package quang_ly_code_gym.repository.student_repository;

import quang_ly_code_gym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void addStudent(Student student);
    void removeStudent(int id);
    Student checkId(int id);
     void saveData();
  void editStudent(int index, Student student);
   void sortStudentsAscendingByName();
     void sortStudentsAscendingById();
}
