package utils;

import models.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataVilla {
    public Map<Villa,Integer> Read() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(Constant.FILE_VILLA);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<Villa,Integer> villas = new LinkedHashMap<>();
        String line;
        String[] temp;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            String serviceName = temp[0];
            Double usableArea = Double.parseDouble(temp[1]);
            Double rentalCost = Double.parseDouble(temp[2]);
            int maximum = Integer.parseInt(temp[3]);
            String rentalType = temp[4];
            String roomStander = temp[5];
            Double swimmingPoolArea = Double.parseDouble(temp[6]);
            int numberOfFloors = Integer.parseInt(temp[7]);
            String villaCode = temp[8];
            int count=Integer.parseInt(temp[9]);
            villas.put(new Villa(serviceName, usableArea, rentalCost, maximum, rentalType, roomStander, swimmingPoolArea, numberOfFloors, villaCode),count);
        }
        bufferedReader.close();
        return villas;
    }

    public void write(Map<Villa,Integer> villas) throws IOException {
        FileWriter fileWriter = new FileWriter(Constant.FILE_VILLA);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Villa i: villas.keySet()){
            bufferedWriter.write(i+","+villas.get(i)+"\n");
        }
        bufferedWriter.close();
    }
}