package bai_tap;

import java.io.Serializable;
import java.time.LocalDate;

public class Teacher extends Person implements ITeacher {
    private String level;

    public Teacher() {
    }

    public Teacher(String name, LocalDate birthDay, String email, String phone, String level) {
        super(name, birthDay, email, phone);
        this.level = level;
    }

    @Override
    public void teachFor(String objectName) {
        System.out.println("Thầy dạy môn " + objectName);
    }

    @Override
    public void say() {
        System.out.println("Chào các em");
    }
}
