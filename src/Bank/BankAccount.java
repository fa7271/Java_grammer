package Bank;

public class BankAccount {
    private String account_number;
    private int balance;

    public BankAccount(String account_number, int balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
