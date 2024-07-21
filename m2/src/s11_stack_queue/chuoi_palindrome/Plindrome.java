package s11_stack_queue.chuoi_palindrome;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Plindrome {
    public static void main(String[] args) {
        String string = "Able is was I ere I saw si Elba";
        string = string.toLowerCase();
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            queue.add(ch + "");
            stack.add(ch + "");
        }
        boolean flag = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("là chuỗi  Plindrome");
        } else {
            System.out.println("không phải là chuỗi Plindrome");
        }
    }
}
