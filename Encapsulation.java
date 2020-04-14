import java.util.*;

class Bank {
    private long acno;
    String ifscode = "HDFC000123";
    private double bal = 5000;

    void setacno(long acno) {
        this.acno = acno;
    }

    void setbal(double bal) {
        this.bal = bal;
    }

    long getacno() {
        return (acno);
    }

    double getBal() {
        return (bal);
    }

    class Employee extends Bank {
        public void information() {
            setacno(123456);
            System.out.println("acno=" + getacno());
            System.out.println("IFSCode=" + ifscode);
            setbal(850);
            System.out.println("Bal=" + getBal());

        }
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.information();
    }
}
