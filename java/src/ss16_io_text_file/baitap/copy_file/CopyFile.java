package ss16_io_text_file.baitap.copy_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập source file cần copy: ");
            String sourceFile = scanner.nextLine();
            inStream = new FileInputStream(sourceFile);
            System.out.println("Nhập source file để lưu: ");
            String sourceFileCopy = scanner.nextLine();
            outStream = new FileOutputStream(sourceFileCopy);

            int length;
            byte[] buffer = new byte[1024];
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("Copy thành công ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert inStream != null;
            inStream.close();
            assert outStream != null;
            outStream.close();
        }
    }
}
