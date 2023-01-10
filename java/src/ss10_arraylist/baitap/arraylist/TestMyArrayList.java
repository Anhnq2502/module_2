package ss10_arraylist.baitap.arraylist;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("anh");
        list.add("không");
        list.add("đẹp");
        list.add("trai");

        print(list.getData());
        System.out.println(list.indexOf("không"));
        System.out.println(list.indexOf("có"));
        list.remove(1);
        list.add("rất",1);
        print(list.getData());
        MyArrayList<String> clone = list.clone();
        System.out.println(clone.contains("anh"));
        System.out.println(clone.contains("không"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
