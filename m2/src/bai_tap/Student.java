package bai_tap;

import java.time.LocalDate;

public class Student extends Person implements IStudent {
    private String nameClass;

    public String getNameClass() {
        return nameClass;
    }

    public Student() {

    }

    public Student(String name, LocalDate birthDay, String email, String phone, String nameClass) {
        super(name, birthDay, email, phone);
        this.nameClass = nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public void learn(String objectName) {
        System.out.println(" Học môn " + objectName);
    }

    @Override
    public void say() {
        System.out.println("I am student");
    }
}
