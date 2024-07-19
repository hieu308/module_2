package s11_stack_queue.kiem_tra_dau_ngoac;

import java.util.Stack;

public class ParenthesesCheck {
    public static void main(String[] args) {
        String string = "(s * (s – a) * (s – b))) * (s – c)   ";
        if (checkParentheses(string)) {
            System.out.println("đúng");
        } else {
            System.out.println("sai");
        }

    }

    public static boolean checkParentheses(String string) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                bStack.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    String left = bStack.pop() + "";
                    if (!left.equals("(")) {
                        return false;

                    }
                }
            }
        }
        return true;
    }
}
