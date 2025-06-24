// package 3-Object Oriented Programming Essentials.4-encapsulation;

class bankBalance{
    private int balance;

    bankBalance(int val){
        balance=val;
    }

    public void deposit(int amount){
        balance+=amount;
    }

    void showBalance(){
        System.out.println(balance);
    }
}

public class encapsulation {
    public static void main(String[] args) {
        bankBalance b1=new bankBalance(0);
        b1.deposit(100);
        b1.showBalance();
    }
}
