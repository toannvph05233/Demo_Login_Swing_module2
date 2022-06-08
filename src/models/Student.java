package models;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String phone;
    private String address;
    private ClassCG classCG;

    public Student() {
    }

    public Student(String name, int age, String phone, String address, ClassCG classCG) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.classCG = classCG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ClassCG getClassCG() {
        return classCG;
    }

    public void setClassCG(ClassCG classCG) {
        this.classCG = classCG;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", Address='" + address + '\'' +
                ", classCG=" + classCG.toString() +
                '}';
    }

    public String write() {
        return name + "," + age + "," + phone + "," + address + "," + classCG.getName();
    }
}
