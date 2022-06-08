package models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassCG implements Serializable {
    private String name;
    private Date createDay;
    private String course;
    private int quantity;

    public ClassCG() {
    }

    public ClassCG(String name, Date createDay, String course, int quantity) {
        this.name = name;
        this.createDay = createDay;
        this.course = course;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDay() {
        return createDay;
    }

    public void setCreateDay(Date createDay) {
        this.createDay = createDay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return "ClassCG{" +
                "name='" + name + '\'' +
                ", createDay=" + formatter.format(createDay) +
                ", course='" + course + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
