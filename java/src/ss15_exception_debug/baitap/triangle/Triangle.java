package ss15_exception_debug.baitap.triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        boolean flag;
        do {
            try {
                System.out.print("Nhập cạnh thứ nhất: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh thứ hai: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh thứ ba: ");
                double c = Double.parseDouble(scanner.nextLine());
                flag = false;
                check.checkTriangleEdges(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Không được nhập chữ");
                flag = true;
            } catch (Exception e) {
                System.out.println("Lỗi: Không đúng định dạng ");
                flag = true;
            } finally {
                System.out.println("Kết thúc chương trình");
            }
        } while (flag);
    }
}

