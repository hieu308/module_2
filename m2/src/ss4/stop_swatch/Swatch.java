package ss4.stop_swatch;

public class Swatch {
    private double starTime ;
    private double endTime ;
    public double getStarTime() {
        return this.starTime;
    }

   public double getEndTime() {
    return this.endTime;}
    public void start() {
        this.starTime = System.currentTimeMillis();
    }public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
       return this.endTime - starTime;
    }
}
