import java.io.*;
import java.util.Scanner;

class Cust {
    double bal = 5000;
    long mno;
    long acno;
    String cname;
    int amount;
    Scanner sc = new Scanner(System.in);

    void Input() {
        System.out.println("Enter Customer Name::");
        cname = sc.next();

        System.out.println("Enter Account Number::");
        acno = sc.nextLong();

        System.out.println("Enter Customer Mobile No::");
        acno = sc.nextLong();
    }

    void Display() {
        System.out.println("Customer Name::" + cname);

        System.out.println("Account Number::" + acno);

        System.out.println("Customer Mobile No::" + mno);

    }

    void BalanceInfo() {
        System.out.println("Present Balance::" + bal);
    }

    void Transfer() {
        System.out.println("Enter Account Number to Treansfer::");
        long facno = sc.nextLong();

        System.out.println("Enter IFSC Code::");
        String ifsccode = sc.next();
        if (facno == 123456 && ifsccode.equals("sbino0123")) {
            System.out.println("Enter Amount To Tranfer::");
            int amount = sc.nextInt();
            if (amount <= bal) {
                System.out.println("Amount transfered To" + facno + ":" + amount);
            } else {
                System.out.println("Insuficient Amount transfer");
            }
        } else {
            System.out.println("Invalid Account Number..!!!");
        }

    }

}

class BankEmp extends Cust {
    void Deposit() {
        System.out.println("Enter Amount to Deposit::");
        amount = sc.nextInt();
        bal = bal + amount;
        BalanceInfo();
    }

    void Withdraw() {
        System.out.println("Enter Amount to Withdraw::");
        amount = sc.nextInt();
        bal = bal - amount;
        BalanceInfo();
    }
}

class NetBanking {
    void login() {
        Console c = System.console();
        System.out.println("Enter a CID::");
        String s = c.readLine();
        int cid = Integer.parseInt(s);
        System.out.println("Enter PassWord::");
        char pass[] = c.readPassword();
        String c2 = new String(pass);
        if (cid == 1234 && c2.equals("faizan")) {
            Cust c1 = new Cust();
            c1.Input();
            c1.Display();
            c1.Transfer();
            c1.BalanceInfo();
            // c1.Deposit();
            // c1.Withdraw();
        } else if (cid == 1111 && c2.equals("admin")) {
            BankEmp b1 = new BankEmp();
            b1.Deposit();
            b1.Withdraw();
            b1.Input();
            b1.Display();
            b1.Transfer();
            b1.BalanceInfo();
        } else {
            System.out.println("Invalid Login...!!!!");
        }
    }

    public static void main(String[] args) {
        NetBanking c1 = new NetBanking();
        c1.login();
    }
}