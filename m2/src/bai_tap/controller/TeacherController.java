package bai_tap.controller;

import bai_tap.model.Teacher;
import bai_tap.service.teacher_service.ITeacherService;
import bai_tap.service.teacher_service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public static Object display;
    ITeacherService iTeacherService = new TeacherService();
    Scanner scanner = new Scanner(System.in);
    public void displayTeacher(){
        Teacher[] teacher = iTeacherService.findTeachers();
        for (Teacher t : teacher) {
            if (t != null) {
                System.out.println(t);
            }

        }
    }
    public void displayTeacherDetails() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Quảng lý code gym: \n" +
                    "1.Hiển thị danh sách Giảng viên \n" +
                    "2.Thêm mới Giảng viên \n" +
                    "3.Xoá Giảng viên \n" +
                    "4.Chỉnh sửa Giảng viên \n" +
                    "5.Trở về \n");
            System.out.println("Nhập lựa chọn của bạn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayTeacher();
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
