package ss17_io_binary_serialization.baitap.copy_file;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập source file cần copy: ");
            String sourceFile = scanner.nextLine();
            inputStream = new FileInputStream(sourceFile);
            System.out.println("Nhập source file để lưu: ");
            String targetFile = scanner.nextLine();
            outputStream = new FileOutputStream(targetFile);
            System.out.println("Số byte của file là: " + targetFile.length());

            int length;
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("Copy thành công ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert inputStream != null;
            assert outputStream != null;
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
