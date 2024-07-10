package ss5.access_modifier;

public  class Circle {
    public static void main(String[] args) {
        TestCircle circle = new TestCircle();
        System.out.println("Diện tích hình tròn là" + " "+circle.getArea());
        System.out.println("Bán kính hình tròn là" + " "+circle.getRadius());
    }
}
