package quang_ly_code_gym.controller;

import quang_ly_code_gym.model.Student;
import quang_ly_code_gym.service.student_service.IStudentService;
import quang_ly_code_gym.service.student_service.StudentService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    IStudentService iStudentService = new StudentService();
    Scanner sc = new Scanner(System.in);
    List<Student> students = iStudentService.findAll();
    public void displayStudent() {

        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }

        }
    }


    public void addStudent() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên \n");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh \n");
        LocalDate birthday = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập email \n");
        String email = sc.nextLine();
        System.out.println("Nhập Số điện thoại \n");
        String number = sc.nextLine();
        System.out.println("Nhập tên lớp \n");
        String className = sc.nextLine();
        Student student = new Student(id, name, birthday, email, number, className);
        iStudentService.addStudent(student);

    }

    public void updateStudent() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        Student st1 = iStudentService.checkId(id);
        int index = iStudentService.getIndex(st1);
        if (st1 != null) {
            System.out.println("Nhập thông tin chỉnh xửa");
            System.out.println("Nhập id :");
            int idUpdate = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tên :");
            String nameUpdate = sc.nextLine();
            System.out.println("Nhap ngày sinh");
            LocalDate birthdayUpdate = LocalDate.parse(sc.nextLine());
            System.out.println("Nhập email");
            String emailUpdate = sc.nextLine();
            System.out.println("Nhập số điện thoại");
            String numberUpdate = sc.nextLine();
            System.out.println("Nhap tên lơp");
            String classUpdate = sc.nextLine();
            Student st2 = new Student(idUpdate, nameUpdate, birthdayUpdate, emailUpdate, numberUpdate, classUpdate);

            iStudentService.editStudent(index, st2);
        }

    }

    public void deleteStudent() {
        System.out.println("Nhập id học sinh muốn xoá \n");
        int id = Integer.parseInt(sc.nextLine());
        Student st1 = iStudentService.checkId(id);
        if (st1 != null) {
            int index = iStudentService.getIndex(st1);
            iStudentService.removeStudent(index);
            System.out.println("xoá thành công");
        }


    }

    public void displayStudentDetails() {
        int choice;
        do {
            System.out.println("Quảng lý code gym: \n" +
                    "1.Hiển thị danh sách học viên \n" +
                    "2.Thêm mới học  viên \n" +
                    "3.Xoá học viên \n" +
                    "4.Chỉnh sửa học viên \n" +
                    "5.Trở về \n");
            System.out.println("Nhập lựa chọn của bạn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayStudent();
                    break;
                case 2:
                    addStudent();
                    break;

                case 3:
                    deleteStudent();
                    break;
                case 4:
                    updateStudent();
                    break;

                case 5:
                    return;

            }
        } while (true);
    }


}
