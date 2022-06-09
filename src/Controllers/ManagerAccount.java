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


    public boolean login(String user, String pass) {
        for (Account acc : accounts) {
            if (acc.getUserName().equals(user) && acc.getPass().equals(pass)) {
                ManagerAccount.account = acc;
                return true;
            }
        }
        return false;
    }

    public void register(String user, String pass) {
        if (!checkUserName(user)) {
            System.err.println("trùng userName");
            return;
        }
        accounts.add(new Account(user, pass, "user"));
        readerAndWrite.write(accounts, "account.txt");
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
