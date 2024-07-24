package quang_ly_code_gym.repository.student_repository;

import quang_ly_code_gym.model.Person;
import quang_ly_code_gym.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> list;

    static {
        list = new ArrayList<>();
        Student s1 = new Student(123, "MADARA", LocalDate.parse("2000-12-02"), "madara@goole.com", "0900398234", "c01");
        Student s2 = new Student(441, "Itachi", LocalDate.parse("2001-11-12"), "itachi@goole.com", "093374723", "c02");
        list.add(s1);
        list.add(s2);

    }

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public List<Student> findAll() {
        return list;
    }


    @Override
    public void removeStudent(int id) {
        list.remove(checkId(id));

    }

    public StudentRepository() {
        super();
    }

    @Override
    public Student checkId(int id) {
        for (Student student : list) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }



    @Override
    public void editStudent(int index, Student student) {

        list.set(index, student);
    }

    @Override
    public void sortStudentsAscendingByName() {
        list.sort((p1, p2) -> {
            int nameComparison = p1.getName().compareToIgnoreCase(p2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return Integer.compare(p1.getId(), p2.getId());
            }
        });
    }


    @Override
    public void sortStudentsAscendingById() {
        list.sort(Comparator.comparingInt(Person::getId));
    }
}
