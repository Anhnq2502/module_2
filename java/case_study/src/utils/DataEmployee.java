package utils;

import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataEmployee {
    public List<Employee> readEmployee() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(Constant.FILE_EMPLOYEE);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Employee> customerList1 = new ArrayList<>();
        String line;
        String[] temp;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int employeeCode = Integer.parseInt(temp[0]);
            String level=temp[1];
            String workingPosition=temp[2];
            Double wage=Double.parseDouble(temp[3]);
            String name = temp[4];
            int dayOfBirth = Integer.parseInt(temp[5]);
            String sex = temp[6];
            int identityCardNumber = Integer.parseInt(temp[7]);
            int phoneNumber = Integer.parseInt(temp[8]);
            String email = temp[9];
            customerList1.add(new Employee(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, employeeCode, level,workingPosition,wage));
        }
        bufferedReader.close();
        return customerList1;
    }
    public void writeEmployee(List<Employee> employeeList) throws IOException {
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(Constant.FILE_EMPLOYEE);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Employee i: employeeList){
                bufferedWriter.write(i.toString()+"\n");
            }
        } catch (IOException e) {
            System.out.println("Can not write to file");
        } finally {
            bufferedWriter.close();
        }
    }
}