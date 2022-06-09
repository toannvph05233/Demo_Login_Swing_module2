package views;

import Controllers.ManagerAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel panel1;
    private JTextField userName;
    private JButton loginButton;
    private JButton registerButton;
    private JPasswordField passWord;
    private JLabel error;
    ManagerAccount managerAccount = new ManagerAccount();

    Login() {
        this.setContentPane(panel1);
        this.setVisible(true);
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        JFrame jFrame = this;
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userName.getText();
                String pass = passWord.getText();
                if (managerAccount.login(user, pass)) {
                    jFrame.setVisible(false);
                    Student student = new Student();
                    student.setVisible(true);
                }else {
                    error.setText("Bạn đã nhập sai mật khẩu hoặc pass");
                }
            }
        });
    }


    public static void main(String[] args) {
        new Login();
    }


}
