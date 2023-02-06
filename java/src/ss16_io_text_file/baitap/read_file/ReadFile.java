package ss16_io_text_file.baitap.read_file;

import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        Country country1 = new Country(1, "AU", "Australia");
        Country country2 = new Country(2, "CN", "China");
        Country country3 = new Country(3, "AU", "Australia");
        Country country4 = new Country(4, "CN", "China");
        Country country5 = new Country(5, "JP", "Japan");
        Country country6 = new Country(6, "CN", "China");
        Country country7 = new Country(7, "JP", "Japan");
        Country country8 = new Country(8, "TH", "ThaiLand");


        FileUtil.writeCSV(country1);
        FileUtil.writeCSV(country2);
        FileUtil.writeCSV(country3);
        FileUtil.writeCSV(country4);
        FileUtil.writeCSV(country5);
        FileUtil.writeCSV(country6);
        FileUtil.writeCSV(country7);
        FileUtil.writeCSV(country8);
        List<Country> countryList = FileUtil.readCSV();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
