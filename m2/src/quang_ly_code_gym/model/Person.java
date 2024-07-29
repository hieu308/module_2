package quang_ly_code_gym.model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Person implements Serializable {
    private int id;
    private String name;
    private LocalDate birthDay;
    private String email;
    private String phone;


    public Person() {
    }

    public Person(int id,String name, LocalDate birthDay, String email, String phone) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
                "  id : '" + id + '\'' +
                "  Name : '" + name + '\'' +
                ", birthDay : " + birthDay +
                ", email : '" + email + '\'' +
                ", phone : '" + phone + '\'' ;
    }

}
