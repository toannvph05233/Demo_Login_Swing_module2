import Controllers.ManagerAccount;
import Controllers.ManagerStudent;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        ManagerAccount managerAccount = new ManagerAccount();

        while (true) {
            if (ManagerAccount.account == null) {
                managerAccount.menuLogin();
            } else {
                if (ManagerAccount.account.getRole().equals("admin")) {
                    managerStudent.menuAdmin();
                } else {
                    managerStudent.menuUser();
                }
            }
        }
    }
}
