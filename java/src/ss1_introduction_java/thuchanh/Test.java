package ss1_introduction_java.thuchanh;


import java.util.Scanner;

public class Test {
    //        int solution ( int year){
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int year = Integer.parseInt(scanner.nextLine());

//        static void find_century ( int year){
            if (year <= 0)
                System.out.println("No");
            if (year <= 100)
                System.out.print("1");

            else if (year % 100 == 0)
                System.out.print(year / 100 );

            else
                System.out.print(year / 100 + 1 );
        }

    }

