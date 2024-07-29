package quang_ly_code_gym.repository.student_repository;

import quang_ly_code_gym.model.Person;
import quang_ly_code_gym.model.Student;

import java.io.*;
import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    public static final String FILE_STUDENTS = "students.csv";
    public static final String FILE_IOBINARY = "students.dat";
    private static List<Student> list;

    static {
        list = new ArrayList<>();
        loadData();

    }

    public static void loadData() {

//        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_STUDENTS))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                Student student = Student.fromString(line);
//                if (student != null) {
//                    list.add(student);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_IOBINARY))) {
            list = (List<Student>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveData() {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_STUDENTS ))) {
//            for (Student student : list) {
//                writer.write(student.studentInfo());
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_IOBINARY))) {
            outputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void addStudent(Student student) {
        list.add(student);
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_STUDENTS,true))) {
//            writer.write(student.studentInfo());
//            writer.newLine();
//        } catch (IOException e) {
//           e.printStackTrace();
//        }
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
