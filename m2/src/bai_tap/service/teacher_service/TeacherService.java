package bai_tap.service.teacher_service;

import bai_tap.model.Teacher;
import bai_tap.repository.student_repository.IStudentRepository;
import bai_tap.repository.student_repository.StudentRepository;
import bai_tap.repository.teacher_repository.ITeacherRepository;
import bai_tap.repository.teacher_repository.TeacherRepository;

public class TeacherService implements ITeacherService {
    ITeacherRepository iTeacherRepository = new TeacherRepository();

    @Override
    public Teacher[] findTeachers() {
        return iTeacherRepository.findTeacher();
    }
}
