package ss3;

public class TimMinValue {
    public static void main(String[] args) {
        int[] array = {13,23,33,44,55,6,75,8,96};
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
