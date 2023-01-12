package ss10_dsa_list.baitap.arraylist;

import ss5_static_access_modifier.baitap.Student;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Duy");
        Student student2 = new Student(2, "Minh");
        Student student3 = new Student(3, "Lãnh");
        Student student4 = new Student(4, "Đào");
        Student student5 = new Student(5, "Hải");
        Student student6 = new Student(6, "Hiếu");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);
//        studentMyArrayList.add(student6,2);
//        studentMyArrayList.clear();
        studentMyArrayList.size();
        System.out.println(studentMyArrayList.size());
        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println(studentMyArrayList.indexOf(student2));
        System.out.println(studentMyArrayList.contains(student4));

        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(0);
        Student student = newMyArrayList.remove(2);
        System.out.println(student.getName());

    }
}
