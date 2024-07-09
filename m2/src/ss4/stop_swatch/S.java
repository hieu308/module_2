package ss4.stop_swatch;

public class S {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Swatch stopwatch = new Swatch();
        stopwatch.start();
        System.out.println(stopwatch.getStarTime());
        for (int i = 0; i < array.length-1; i++) {
           int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 -i] = temp;
        }
        stopwatch.stop();
        System.out.println(stopwatch.getEndTime());
        System.out.println(stopwatch.getElapsedTime());
    }

}
