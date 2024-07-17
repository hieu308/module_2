package bai_tap.controller;

import bai_tap.model.Student;
import bai_tap.service.student_service.IStudentService;
import bai_tap.service.student_service.StudentService;

import java.util.Scanner;

public class StudentController {
    IStudentService iStudentService = new StudentService();
    Scanner sc = new Scanner(System.in);

    public void displayStudent() {
        Student[] students = iStudentService.findAll();
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }

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
                    System.out.println("giảng viên");
                    break;
                case 5:
                    return;

            }
        } while (true);
    }

}
