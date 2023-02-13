package utils;

import models.Booking;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataBooking {
    public List<Booking> readBooking() {
        List<Booking> bookingList=new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(Constant.FILE_BOOKING);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int bookingCode = Integer.parseInt(temp[0]);
                LocalDate startDay = LocalDate.parse(temp[1]);
                LocalDate finishDay = LocalDate.parse(temp[2]);
                int customerCode = Integer.parseInt(temp[3]);
                String serviceName = temp[4];
                String serviceCode=temp[5];
                bookingList.add(new Booking(bookingCode, startDay, finishDay, customerCode, serviceName,serviceCode));

            }
            bufferedReader.close();
        } catch (IOException e) {

        }
        return bookingList;
    }
    public void writeBooking(List<Booking> bookingList){
        BufferedWriter bufferedWriter= null;
        try {
            FileWriter fileWriter = new FileWriter(Constant.FILE_BOOKING);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking i : bookingList) {
                bufferedWriter.write(i + "\n");
            }
        }catch (IOException e){
            throw new RuntimeException();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}