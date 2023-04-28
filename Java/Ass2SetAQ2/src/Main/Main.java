package Main;
import java.util.Scanner;
class Account {
    int acno;
    String name;
    double bal;

    Account(int acno, String name, double bal) {

        this.acno = acno;
        this.name = name;
        this.bal = bal;

    }

    void deposit(double amount) {
        bal += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        bal -= amount;
        System.out.println("Withdraw: " + amount);
    }

    public String toString() {
        return "Account Number: " + acno + ", Name: " + name + ", Balance: " + bal;
    }
}

class Savings extends Account {

    double min_bal;
    int tran_limit;
    double int_rate;
    int tran_count = 0;

    Savings(int acno, String name, double bal, double min_bal, int tran_limit, double int_rate) {

        super(acno, name, bal);
        this.min_bal = min_bal;
        this.tran_limit = tran_limit;
        this.int_rate = int_rate;

    }



    void withdraw(double amount) {

        if (bal - amount >= min_bal) {
            bal -= amount;
            tran_count++;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public String toString() {
        return "Savings Account: " + super.toString() + ", Minimum Balance: " + min_bal + ", Transaction Limit: " + tran_limit + ", Interest Rate: " + int_rate;
    }
}

class Current extends Account {
    double min_bal;
    Current(int acno, String name, double bal, double min_bal) {
        super(acno, name, bal);
        this.min_bal = min_bal;
    }
    
    void withdraw(double amount) {

        if (bal - amount >= min_bal) {
            bal -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }



    void deposit(double amount) {
        bal += amount;
        System.out.println("Deposited: " + amount);
    }

    public String toString() {
        return "Current Account: " + super.toString() + ", Minimum Balance: " + min_bal;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Savings s = new Savings(101, "John", 5000, 1000, 3, 0.05);
        Current c = new Current(102, "Jane", 8000, 5000);

        System.out.println(s);
        System.out.println(c);

        s.deposit(2000);
        s.withdraw(1000);
        s.withdraw(2000);
        System.out.println(s);

        c.deposit(12000);
        c.withdraw(1000);

        System.out.println(c);

        input.close();
    }
}
/*import java.io.*;
class Account{
    int acno;
    String name;
    double bal;
    
    Account(int acno,String name,double bal){
        this.acno=acno;
        this.name=name;
        this.bal=bal;
        
    }
    
    void deposit(double amount){
        bal+=amount;
        System.out.println("Deposit:"+amount);
        
    }
    void withdraw(double amount){
        bal+=amount;
        System.out.println("Withdraw:"+amount);
        
    }
    
    public String toString(){
        return "Account No:"+acno+", Name:"+name+", Balance:"+bal;
    }
}

    class Savings extend Account{
        double min_bal;
        int tran_limit;
        double int_rate;
        int tran_cnt=0;
        
        Savings(int acno,String name,double bal,double min_bal,int tran_limit,double int_rate){
            super(acno,name,bal);
            this.min_bal=min_bal;
            this.tran_limit=tran_limit;
            this.int_rate=int_rate;
        }
        
        void withdraw(double amount){
            if(bal-amount>=min_bal){
                bal-=amount;
                tran_cnt++:
                System.out.println("Withdraw:"+amount);
            }
            else{
                System.out.println("Insufficient balance!");
            }
        }
         public String toString(){
        return "Saving Account:"+super.toString()+ "Minimum Balance: " + min_bal + ", Transaction Limit: " + tran_limit + ", Interest Rate: " + int_rate;
    }
       class Current extend Account{
        double min_bal;
        
        
        Savings(int acno,String name,double bal,double min_bal){
            super(acno,name,bal);
            this.min_bal=min_bal;
        
        }
        
        void withdraw(double amount){
            if(bal-amount>=min_bal){
                bal-=amount;
                System.out.println("Withdraw:"+amount);
            }
            else{
                System.out.println("Insufficient balance!");
            }
        }
        void deposit(double amount) {
        bal += amount;
        System.out.println("Deposited: " + amount);
    }
         public String toString(){
         return "Saving Account:"+super.toString()+ "Minimum Balance: " + min_bal;
    }
    } 
        
    }

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

*/