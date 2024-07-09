package ss4.xay_dung_lop_fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        speed = SLOW;
        on=false;
        radius = 5.0;
        color = "blue";
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public boolean isOn(){
        return on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        if(on){
            return"speed: "+speed+", on: "+on+", radius: "+radius+", color: "+color;
        }else{
            return "color: "+color+", on: "+on+", radius: "+radius+", speed: "+speed;
        }
    }
}
