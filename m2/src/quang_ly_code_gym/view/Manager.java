package quang_ly_code_gym.view;

import quang_ly_code_gym.controller.StudentController;
import quang_ly_code_gym.controller.TeacherController;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        int choice;
        do {
            System.out.println("Quảng lý code gym: \n" +
                    "1.Quang lý học viên \n" +
                    "2.Quang lý giảng viên \n" +
                    "3.Thoát chương trình \n");
            System.out.println("Nhập lựa chọn của bạn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentController.displayStudentDetails();
                    break;
                case 2:
                    teacherController.displayTeacherDetails();
                    break;
                case 3:
                    System.exit(0);

            }
        } while (true);
    }
}
