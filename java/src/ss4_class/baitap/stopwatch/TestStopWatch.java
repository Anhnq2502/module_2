package ss4_class.baitap;

import java.util.Scanner;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"start\" to begin count milisecond !!");
        String startTime = sc.nextLine();

        if (startTime.equals("start")) {
            System.out.println("Start time is " + stopWatch.start() + " milisecond");
            System.out.println("Enter \"stop\" to stop count milisecond !!");
            String stopTime = sc.nextLine();

            if (stopTime.equals("stop")) {
                System.out.println("End time is " + stopWatch.stop() + " milisecond");
                System.out.println(stopWatch.getter());
                System.out.println("Time has counted: " + stopWatch.getElapsedTime() + " milisecond");
            }
        } else {
            System.out.println("Must be entered correctly \"start\" to count !!");
        }
    }
}
