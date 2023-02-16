package views;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(day, formatter);
        if (date.isLeapYear()){
            System.out.println("Năm nhuận");
        }else {
            System.out.println("không phải năm nhuận");
        }
    }
}
