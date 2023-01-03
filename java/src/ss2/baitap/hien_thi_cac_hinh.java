package ss2.baitap;
import java.util.Scanner;
public class hien_thi_cac_hinh {
    public static void main(String[] args){
        int height;
        int width;
        Scanner sc = new Scanner(System.in);

        System.out.print("height = ");
        height = sc.nextInt();
        System.out.print("width = ");
        width = sc.nextInt();
        System.out.println("Hình chữ nhật");

        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        sc.close();
        System.out.println("Hình tam giác");
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
        System.out.println("Hình tam giác ngược");
        for (int i = height; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }

}
