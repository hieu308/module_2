package bai_tap.model;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate birthDay;
    private String email;
    private String phone;

    public Person() {
    }

    public Person(String name, LocalDate birthDay, String email, String phone) {
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public abstract void say();

    @Override
    public String toString() {
        return
                "  Name : '" + name + '\'' +
                ", birthDay : " + birthDay +
                ", email : '" + email + '\'' +
                ", phone : '" + phone + '\'' ;
    }
}
