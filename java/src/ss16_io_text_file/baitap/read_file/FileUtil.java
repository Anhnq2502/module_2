package ss16_io_text_file.baitap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "F:\\CodeGym\\module2\\java\\src\\ss16_io_text_file\\baitap\\read_file\\country.csv";

    public static List<Country> readCSV() {
        List<Country> countryList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Country country;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];

                country = new Country(id, code, name);
                countryList.add(country);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return countryList;
    }

    public static void writeCSV(Country country) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(country.getId() + "," + country.getCode() + "," + country.getName() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
