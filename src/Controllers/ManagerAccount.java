package Controllers;

import io.ReaderAndWrite;
import models.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerAccount {
    ReaderAndWrite<Account> readerAndWrite = new ReaderAndWrite<>();
    Scanner scanner = new Scanner(System.in);
    public static Account account;
    ArrayList<Account> accounts = new ArrayList<>();

    {
        accounts = readerAndWrite.reader("account.txt");
        if (accounts.size() == 0) {
            accounts.add(new Account("admin", "admin", "admin"));
        }
    }

    public void menuLogin() {
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
        }
    }

    public boolean login() {
        System.out.println("Nhập userName :");
        String user = scanner.nextLine();
        System.out.println("Nhập passWord :");
        String pass = scanner.nextLine();

        for (Account acc : accounts) {
            if (acc.getUserName().equals(user) && acc.getPass().equals(pass)) {
                ManagerAccount.account = acc;
                return true;
            }
        }
        return false;
    }

    public void register() {
        String user = null;
        while (true) {
            System.out.println("Nhập userName :");
            user = scanner.nextLine();
            if (checkUserName(user)) {
                break;
            }else {
                System.err.println("trùng userName");
            }
        }
        System.out.println("Nhập passWord :");
        String pass = scanner.nextLine();
        accounts.add(new Account(user, pass, "user"));

        readerAndWrite.write(accounts,"account.txt");
    }

    public boolean checkUserName(String userName) {
        for (Account acc : accounts) {
            if (acc.getUserName().equals(userName)) {
                return false;
            }
        }
        return true;
    }
}
