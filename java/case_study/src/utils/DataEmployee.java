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
            int employeeCode = Integer.parseInt(temp[6]);
            String level=temp[7];
            String workingPosition=temp[8];
            Double wage=Double.parseDouble(temp[9]);
            String name = temp[0];
            String dayOfBirth =(temp[1]);
            String sex = temp[2];
            int identityCardNumber = Integer.parseInt(temp[3]);
            int phoneNumber = Integer.parseInt(temp[4]);
            String email = temp[5];
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
            System.out.println("Không thể viết file");
        } finally {
            assert bufferedWriter != null;
            bufferedWriter.close();
        }
    }
}