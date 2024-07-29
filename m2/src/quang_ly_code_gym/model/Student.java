package quang_ly_code_gym.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Student extends Person  {
    private String nameClass;

    public String getNameClass() {
        return nameClass;
    }

    public Student() {

    }

    public Student(int id, String name, LocalDate birthDay, String email, String phone, String nameClass) {
        super(id, name, birthDay, email, phone);
        this.nameClass = nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }


    public Student(String nameClass) {
        this.nameClass = nameClass;
    }

    public static Student fromString(String line) {
        String[] parts = line.split(",");

            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            LocalDate birthDay = LocalDate.parse(parts[2]);
            String email = parts[3];
            String phone = parts[4];
            String nameClass = parts[5];
            return new Student(id, name, birthDay, email, phone, nameClass);

    }

    @Override
    public void say() {
        System.out.println("I am student");
    }

    @Override
    public String toString() {
        return super.toString() + ", nameClass :" + nameClass;
    }

    public String studentInfo() {
        return  getId() + "," + getName() + "," + super.getBirthDay() + "," + super.getEmail() + "," + super.getPhone() + "," + getNameClass();
    }
}
