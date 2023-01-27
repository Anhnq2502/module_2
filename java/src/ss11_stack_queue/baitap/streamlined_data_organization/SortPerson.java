package ss11_stack_queue.baitap.streamlined_data_organization;


import java.util.Comparator;


class SortPerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}