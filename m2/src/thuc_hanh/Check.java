package thuc_hanh;

import java.time.LocalDate;

public class Check {
    public static void main(String[] args) {
        Student sv= new Student("hieu", LocalDate.parse("1992-10-09"),"goku@gmail.com");
        System.out.println(sv);

    }
}
