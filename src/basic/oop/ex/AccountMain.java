package basic.oop.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        // 입금
        account.deposit(10000);
        // 출금
        account.withdraw(9000);
        account.withdraw(2000); // 잔액 부족
        // 잔액 조회
        account.showBalance();
    }
}
