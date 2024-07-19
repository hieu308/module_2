package bai_tap.controller;

import bai_tap.model.Student;
import bai_tap.service.student_service.IStudentService;
import bai_tap.service.student_service.StudentService;

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
    public void editStudent() {
        System.out.println("Nhập index");
        int index = Integer.parseInt(sc.nextLine());
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
        Student student = new Student(name, birthday, email, number, className);
        students.set(index,student);
        System.out.println("Sửa thành công");
    }

    public void addStudent() {

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
        Student student = new Student(name, birthday, email, number, className);
        iStudentService.addStudent(student);

    }

    public void deleteStudent() {
        System.out.println("Mời nhập ten muốn xoá \n");
        int index =Integer.parseInt(sc.nextLine()) ;
        Student student = iStudentService.removeStudent(index);
        if (student != null) {
            System.out.println("bạn đã xoá thành công");
        } else {
            System.out.println("Khong tồn tại");
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
                    editStudent();
                    break;
                case 5:
                    return;

            }
        } while (true);
    }


}
