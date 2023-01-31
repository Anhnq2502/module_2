package ss11_stack_queue.baitap.streamlined_data_organization;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class ArrangePerson {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> listPerson = new ArrayList<>(5);
        Queue<Person> NU = new LinkedList<>();
        Queue<Person> NAM = new LinkedList<>();

        listPerson.add(new Person("Hùng", "NAM", LocalDate.of(2001, 02, 22), "CEO"));
        listPerson.add(new Person("Huy", "NAM", LocalDate.of(2001, 07, 14), "Developer"));
        listPerson.add(new Person("Hiếu", "NAM", LocalDate.of(2001, 11, 12), "Developer"));
        listPerson.add(new Person("Trang", "NU", LocalDate.of(2001, 10, 02), "Tester"));
        listPerson.add(new Person("Hiệp", "NU", LocalDate.of(2001, 12, 15), "Manager"));
        listPerson.add(new Person("Na", "NU", LocalDate.of(2001, 3, 26), "Manager"));
        Collections.sort(listPerson, new SortPerson());
        for (Person person : listPerson) {
            if (person.getGender().equals("NU")) {
                NU.add(person);
            }
            if (person.getGender().equals("NAM")) {
                NAM.add(person);
            }
        }
        FileWriter fw = new FileWriter("F:\\CodeGym\\module2\\java\\src\\ss11_stack_queue\\baitap\\streamlined_data_organization\\person.txt");
        for (Person person : NU) {
            fw.write(String.valueOf(person) + "\n");
        }
        for (Person person : NAM) {
            fw.write(String.valueOf(person) + "\n");
        }
        fw.close();
    }
}