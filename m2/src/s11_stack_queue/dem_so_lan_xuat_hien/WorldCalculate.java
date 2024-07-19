package s11_stack_queue.dem_so_lan_xuat_hien;

import java.util.Map;
import java.util.TreeMap;

public class WorldCalculate {
    public static void main(String[] args) {
        String string = " Hello mấy cưng trên mấy nước ";
         countWord(string);

    }
     public static void countWord(String string){
         string = string.toLowerCase();
         System.out.println(string);
         Map<String, Integer> wordCount = new TreeMap<>();
         String[] words = string.split("\\s+");
         for (String word : words) {
             if (wordCount.containsKey(word)) {
                 wordCount.put(word, wordCount.get(word) + 1);
             } else {
                 wordCount.put(word, 1);
             }
         }
         for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
             System.out.println(entry.getKey() + ": " + entry.getValue());
         }
     }

}



