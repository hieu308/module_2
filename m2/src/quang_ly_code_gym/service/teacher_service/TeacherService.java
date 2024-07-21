package quang_ly_code_gym.service.teacher_service;

import quang_ly_code_gym.model.Teacher;
import quang_ly_code_gym.repository.teacher_repository.ITeacherRepository;
import quang_ly_code_gym.repository.teacher_repository.TeacherRepository;

import java.util.List;

public class TeacherService implements ITeacherService {
    ITeacherRepository iTeacherRepository = new TeacherRepository();

    @Override
    public List<Teacher> findTeachers() {
        return iTeacherRepository.findTeacher();
    }
}
