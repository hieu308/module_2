package s13_thuat_toan_tim_kiem.tim_chuoi_tang_dan;

import java.util.*;

public class MaxStringAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuổi");
        String string = sc.nextLine();
        List<Character> stringMax = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            List<Character> list = new ArrayList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.get(list.size() - 1)) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > stringMax.size()) {
                stringMax.clear();
                stringMax.addAll(list);
            }
        }
        for (Character ch : stringMax) {
            System.out.print(ch);
        }
    }


}


