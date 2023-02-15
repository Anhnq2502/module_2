package utils;

import models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataCustomer {
    public List<Customer> Read() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(Constant.FILE_CUSTOMER);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Customer> customerList1 = new ArrayList<>();
        String line;
        String[] temp;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int customerCode = Integer.parseInt(temp[0]);
            String customerType = temp[1];
            String name = temp[2];
            String dayOfBirth =(temp[3]);
            String sex = temp[4];
            int identityCardNumber = Integer.parseInt(temp[5]);
            int phoneNumber = Integer.parseInt(temp[6]);
            String email = temp[7];
            customerList1.add(new Customer(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, customerCode, customerType));


        }
        bufferedReader.close();
        return customerList1;
    }
    public void write(List<Customer> customerList1) throws IOException {
        FileWriter fileWriter=new FileWriter(Constant.FILE_CUSTOMER);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        for (Customer i:customerList1){
            bufferedWriter.write(i.toString()+"\n");
        }
        bufferedWriter.close();
    }
}