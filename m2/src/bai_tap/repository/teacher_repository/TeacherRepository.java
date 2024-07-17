package bai_tap.repository.teacher_repository;

import bai_tap.model.Student;
import bai_tap.model.Teacher;

import java.time.LocalDate;

public class TeacherRepository implements ITeacherRepository {
    private static Teacher[] list;

    static {
        list = new Teacher[5];
        Teacher t1 = new Teacher("Naruto", LocalDate.parse("1993-10-02"), "nuruto@goole.com",
                "0900398234", "Giảng viên It");
        Teacher t2 = new Teacher("SonGoku", LocalDate.parse("1999-07-07"), "songoku@goole.com",
                "093374723", "Giảng viên game");
        list[0] = t1;
        list[1] = t2;
    }

    @Override
    public Teacher[] findTeacher() {
        return list;
    }
}



