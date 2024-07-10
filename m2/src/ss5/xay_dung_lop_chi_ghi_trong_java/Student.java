package ss5.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name;
    private String classes;
    Student() {
        name = "Jhon";
        classes ="C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String getName() {
        return name;
    }
    public String getClasses() {
        return classes;
    }
}
