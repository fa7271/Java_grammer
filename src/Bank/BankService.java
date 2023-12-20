package Bank;

public interface BankService {
    void withdraw();

    void deposit(BankAccount bankAccount, int amount);


    boolean transfer_deposit(BankAccount bankAccount, String whoNumber1, Integer transferMoney);

}
