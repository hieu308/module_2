package s13_thuat_toan_tim_kiem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindMaxString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = sc.nextLine();
        List<Character> list = new ArrayList<Character>();
        List<Character> Max = new ArrayList<Character>();
       for (int i = 0; i < string.length(); i++) {
           char charCurrent = string.charAt(i);
           if(!list.isEmpty() && charCurrent <= list.get(list.size()-1)) {
               list.clear();
           }
           if(!list.contains(charCurrent)) {
               list.add(charCurrent);
           }else{
               list.clear();
               list.add(charCurrent);
           }
           if(list.size() > Max.size()) {
               Max.clear();
               Max.addAll(list);
           }

       }
        StringBuilder result = new StringBuilder();
        for(Character c : Max) {
           result.append(c);
        }
        System.out.println(result);
    }
}