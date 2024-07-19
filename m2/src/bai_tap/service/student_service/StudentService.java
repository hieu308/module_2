package bai_tap.service.student_service;

import bai_tap.model.Student;
import bai_tap.repository.student_repository.IStudentRepository;
import bai_tap.repository.student_repository.StudentRepository;

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

    @Override
    public void editStudent(int index, Student student) {
        iStudentRepository.editStudent(index, student);
    }

    @Override
    public Student removeStudent(int index) {
         iStudentRepository.removeStudent(index);
        return null;
    }
}
