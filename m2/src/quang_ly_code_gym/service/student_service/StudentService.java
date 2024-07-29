package quang_ly_code_gym.service.student_service;

import quang_ly_code_gym.model.Student;
import quang_ly_code_gym.repository.student_repository.IStudentRepository;
import quang_ly_code_gym.repository.student_repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public List<Student> findAll() {

        return iStudentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {

        iStudentRepository.addStudent(student);
    }

    public StudentService() {
        super();
    }

    @Override
    public Student checkId(int id) {
        return iStudentRepository.checkId(id);
    }


    @Override
    public void saveData() {
        iStudentRepository.saveData();
    }

    @Override
    public void editStudent(int index, Student student) {
        iStudentRepository.editStudent(index, student);
    }

    @Override
    public void removeStudent(int index) {
        iStudentRepository.removeStudent(index);
    }


    @Override
    public void sortStudentsAscendingByName() {
        iStudentRepository.sortStudentsAscendingByName();
    }

    @Override
    public void sortStudentsAscendingById() {
        iStudentRepository.sortStudentsAscendingById();
    }
}
