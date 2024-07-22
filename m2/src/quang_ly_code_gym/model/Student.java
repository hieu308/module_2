package quang_ly_code_gym.model;

import java.time.LocalDate;

public class Student extends Person  {
    private String nameClass;

    public String getNameClass() {
        return nameClass;
    }

    public Student() {

    }

    public Student(int id,String name, LocalDate birthDay, String email, String phone, String nameClass) {
        super(id,name, birthDay, email, phone);
        this.nameClass = nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }


    public Student(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public void say() {
        System.out.println("I am student");
    }
}
