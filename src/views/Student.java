package views;

import Controllers.ManagerStudent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Student extends JFrame {

    private JPanel Jpanel;
    private JTable tableStudent;
    ManagerStudent managerStudent = new ManagerStudent();

    Student() {
        this.setContentPane(Jpanel);
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        String[][] data = {
                { "Kundan Kumar Jha", "4031", "CSE" },
                { "Anand Jha", "6014", "IT" }
        };

        String[] columnNames = { "Name", "Roll Number", "Department" };
        String[] tieuDe = {"name", "age", "phone"};
        DefaultTableModel model = new DefaultTableModel(data,tieuDe);
        tableStudent.setModel(model);
    }


}
