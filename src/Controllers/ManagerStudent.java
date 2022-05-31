package Controllers;

import io.ReaderAndWrite;
import models.ClassCG;
import models.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerStudent {
    ReaderAndWrite readerAndWrite = new ReaderAndWrite();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<ClassCG> classCGs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ManagerStudent() {
        classCGs.add(new ClassCG("C0322g1", new Date("22/2/2222"), "Java", 28));
        classCGs.add(new ClassCG("C0322g2", new Date("1/1/2022"), "PHP", 20));
        students = readerAndWrite.reader(classCGs);
    }

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Thêm học viên");
        System.out.println("2. Hiển thị học viên");
        System.out.println("3. Hiển thị học viên theo class");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                showAll();
                break;
            case 3:
                findAllByClass();
                break;
        }
    }

    public void addStudent() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại:");
        String phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();

        System.out.println("Chọn lớp cho học viên :");
        for (int i = 0; i < classCGs.size(); i++) {
            System.out.println("       " + (i + 1) + " : " + classCGs.get(i).getName() + " - " + classCGs.get(i).getCourse());
        }
        int choice = Integer.parseInt(scanner.nextLine());
        Student student = new Student(name, age, phone, address, classCGs.get(choice - 1));
        students.add(student);
        readerAndWrite.write(students);
    }

    public void showAll() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void findAllByClass() {
        System.out.println("Nhập tên lớp muốn hiển thị :");
        String name = scanner.nextLine();
        for (Student s : students) {
            if (s.getClassCG().getName().equals(name)) {
                System.out.println(s);
            }
        }
    }
}
