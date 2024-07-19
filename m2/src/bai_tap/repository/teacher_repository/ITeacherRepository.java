package bai_tap.repository.teacher_repository;

import bai_tap.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> findTeacher();
}
