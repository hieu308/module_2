package tetr;


public class SimpleThrowsExample {


    public void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        System.out.println("Kết quả: " + (a / b));
    }

    public static void main(String[] args) {
        SimpleThrowsExample example = new SimpleThrowsExample();

        try {
            example.divide(10, 2); 
            example.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Ngoại lệ: " + e.getMessage());
        }
    }
}


