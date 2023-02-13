package utils;

import models.Room;

import java.io.*;
import java.util.*;

public class DataRoom {
    public Map<Room,Integer> Read() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(Constant.FILE_ROOM);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<Room,Integer> rooms = new LinkedHashMap<>();
        String line;
        String[] temp;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            String serviceName = temp[0];
            Double usableArea = Double.parseDouble(temp[1]);
            Double rentalCost = Double.parseDouble(temp[2]);
            int maximum = Integer.parseInt(temp[3]);
            String rentalType = temp[4];
            String roomCode = temp[5];
            String freeServiceIncluded = temp[6];
            int count=Integer.parseInt(temp[7]);
            rooms.put(new Room(serviceName, usableArea, rentalCost, maximum, rentalType, roomCode, freeServiceIncluded),count);

        }
        bufferedReader.close();
        return rooms;
    }

    public void write(Map<Room,Integer> rooms) throws IOException {
        FileWriter fileWriter = new FileWriter(Constant.FILE_ROOM);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Room i:rooms.keySet()){
            bufferedWriter.write(i.toString()+","+rooms.get(i)+"\n");
        }
        bufferedWriter.close();
    }
}