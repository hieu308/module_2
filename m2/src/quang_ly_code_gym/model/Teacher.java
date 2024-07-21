package quang_ly_code_gym.model;

import java.time.LocalDate;

public class Teacher extends Person  {
    private String level;

    public Teacher() {
    }

    public Teacher(int id,String name, LocalDate birthDay, String email, String phone, String level) {
        super( id,name, birthDay, email, phone);
        this.level = level;
    }



    @Override
    public void say() {
        System.out.println("Chào các em");
    }
}
