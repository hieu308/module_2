package s11_stack_queue.reserveArray;

import java.util.Arrays;
import java.util.Stack;

public class ReserveArray {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String string = "helo mấy anh em";
        String[] wordArray = string.split("\\s+");

        for (String i : wordArray) {
            stack.push(i);
        }
        for (int i = 0; i < wordArray.length; i++) {
           wordArray[i] = stack.pop();
        }
        System.out.println(Arrays.toString(wordArray));
    }
}
