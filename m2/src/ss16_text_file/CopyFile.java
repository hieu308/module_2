package ss16_text_file;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nguồn source file");
        String source = sc.nextLine();
        System.out.println("Nhập target file");
        String target = sc.nextLine();
        File sourceFile = new File(source);
        File targetFile = new File(target);
        if (!(sourceFile.exists())) {
            System.out.println("Chưa tồn tại file source ");
        }
        if (targetFile.exists()) {
            System.out.println("Đã tồn tại file target ");
        }
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(targetFile)) {
            int charCount = 0;
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }
            System.out.println("sao chép file thành công: " + "Số ký tự là " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
