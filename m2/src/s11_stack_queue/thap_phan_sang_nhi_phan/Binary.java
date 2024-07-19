package s11_stack_queue.thap_phan_sang_nhi_phan;

import java.util.Stack;

public class Binary {

    public static void main(String[] args) {
        int decimalNumber = 18;
        String binaryNumber =decimalToBinary(decimalNumber);
        System.out.println("Hệ nhị phân của " + decimalNumber + " là: " + binaryNumber);

    }
    public static String decimalToBinary(int decimalNum) {
        Stack<Integer> stack = new Stack<Integer>();
        while (decimalNum > 0) {
            int remainder = decimalNum % 2;
            stack.push(remainder);
            decimalNum = decimalNum / 2;

        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());

        }
        return binary.toString();

    }
}

