package ss4.stop_swatch;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[100000];
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        System.out.println(stopwatch.getStarTime());
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
         if (array[i] < min) {
             min = array[i];
         }
        }

        stopwatch.stop();

        System.out.println(stopwatch.getEndTime());
        System.out.println(stopwatch.getElapsedTime());
    }

}
