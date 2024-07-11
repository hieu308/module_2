package thuc_hanh;

import java.time.LocalDate;

public class Student{
    private String name;
    private LocalDate birthDay;
    private String email;
    public Student(String name, LocalDate birthDay, String email){
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
    }
    public String toString(){
        return name + " " + birthDay + " " + email;
    }
    public String learn(String subject){
        return subject;
    }

}