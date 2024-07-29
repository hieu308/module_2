package quang_ly_code_gym.controller;

import quang_ly_code_gym.model.Student;
import quang_ly_code_gym.service.student_service.IStudentService;
import quang_ly_code_gym.service.student_service.StudentService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    IStudentService iStudentService = new StudentService();
    static Scanner sc = new Scanner(System.in);
    List<Student> students = iStudentService.findAll();

    public void displayStudent() {

        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }

        }
    }


    public void addStudent() {
        int id = validateId("Nhập id");
        while (iStudentService.checkId(id) != null) {
            System.out.println("id đã tồn tại.Mời nhập lại id");
            id = Integer.parseInt(sc.nextLine());
        }

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
        System.out.println("Thêm mới học viên thành công");
    }

    public static int validateId(String string) {
        int id;
        while (true) {
            try {
                System.out.println(string);
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu không hợp lệ");
            }
        }
        return id;
    }

    public void searchName() {
        System.out.println("Nhập tên cần tìm");
        String name = sc.nextLine();
        boolean search = false;
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(student);
                search = true;
            }
        }
        if (!search) {
            System.out.println("Tên không tồn tại");
            displayStudentDetails();
        }
    }

    public void updateStudent() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        Student st1 = iStudentService.checkId(id);
        int index = iStudentService.findAll().indexOf(st1);
        if (st1 != null) {

            int choice;
            do {
                System.out.println("Chọn thông tin muốn cập nhật \n" +
                        "1.Cập nhat tên \n" +
                        "2.Cập nhat ngày sinh \n" +
                        "3.Cập nhat email \n" +
                        "4.Cập nhat số điện thoại \n" +
                        "5.Cập nhật lớp \n" +
                        "6.Hoàn thành"
                );
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên ");
                        String newName = sc.nextLine();
                        st1.setName(newName);
                        System.out.println("Cập nhật tên thành công");
                        break;
                    case 2:
                        System.out.println("Nhập ngày sinh ");
                        LocalDate newBirthday = LocalDate.parse(sc.nextLine());
                        st1.setBirthDay(newBirthday);
                        System.out.println("Cập nhật ngày sinh thành công");
                        break;
                    case 3:
                        System.out.println("Nhập emaill ");
                        String newEmail = sc.nextLine();
                        st1.setEmail(newEmail);
                        System.out.println("Cập nhật email thành công");
                        break;
                    case 4:
                        System.out.println("Nhập số điện thoại");
                        String newNumber = sc.nextLine();
                        st1.setPhone(newNumber);
                        System.out.println("Cập nhật số điện thoại thành công");
                        break;
                    case 5:
                        System.out.println("Nhập tên lớp");
                        String newClassName = sc.nextLine();
                        st1.setNameClass(newClassName);
                        System.out.println("Cập nhật tên lop tành công");
                        break;
                }
            }
            while (choice != 6);

            iStudentService.editStudent(index, st1);
            System.out.println("Cập nhật thành công");
        } else {
            System.out.println("id không tồn tại");
        }

    }


    public void deleteStudent() {
        System.out.println("Nhập id học viên muốn xoá \n");
        int id = Integer.parseInt(sc.nextLine());

        if (iStudentService.checkId(id) != null) {
            iStudentService.removeStudent(id);
            System.out.println("Xoá thành công");
        } else {
            System.out.println("id không tồn tại");
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
                    "5.Tìm kiếm  theo  tên học sinh \n" +
                    "6.Sắp xếp học viên \n" +
                    "7.Lưu \n" +
                    "8.Trở về");
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
                    searchName();
                    break;
                case 6:

                    System.out.println("Chọn cách sắp xếp \n" +
                            "1.Sắp xếp theo id học sinh \n" +
                            "2.Sắp xếp theo tên học sinh");
                    int choice2 = Integer.parseInt(sc.nextLine());
                    switch (choice2) {
                        case 1:
                            iStudentService.sortStudentsAscendingById();
                            System.out.println("Đã sắp xếp theo id học viên");
                            break;
                        case 2:
                            iStudentService.sortStudentsAscendingByName();
                            System.out.println("Đã sắp xếp theo tên học viên");
                            break;
                        default:
                            return;
                    }
                case 7:
                    iStudentService.saveData();
                    break;
                case 8:
                    return;
            }
        } while (true);
    }


}
