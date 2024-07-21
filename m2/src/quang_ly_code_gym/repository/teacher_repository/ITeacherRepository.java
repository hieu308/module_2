package quang_ly_code_gym.repository.teacher_repository;

import quang_ly_code_gym.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> findTeacher();
}
