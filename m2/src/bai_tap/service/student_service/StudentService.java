package bai_tap.service.student_service;

import bai_tap.model.Student;
import bai_tap.repository.student_repository.IStudentRepository;
import bai_tap.repository.student_repository.StudentRepository;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public Student[] findAll() {
        return iStudentRepository.findAll();
    }
}
