package basic.oop.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
    }

    void withdraw(int amount) {
        if(balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        }
    }

    void showBalance() {
        System.out.println("잔액은 " + balance + "원입니다.");
    }

}
