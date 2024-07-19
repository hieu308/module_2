package bai_tap.repository.teacher_repository;

import bai_tap.model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> list;

    static {
        list = new ArrayList<>();
        Teacher t1 = new Teacher("Naruto", LocalDate.parse("1993-10-02"), "nuruto@goole.com",
                "0900398234", "Giảng viên It");
        Teacher t2 = new Teacher("SonGoku", LocalDate.parse("1999-07-07"), "songoku@goole.com",
                "093374723", "Giảng viên game");
        list.add(t1) ;
        list.add (t2);
    }

    @Override
    public List<Teacher> findTeacher() {
        return list;
    }
}



