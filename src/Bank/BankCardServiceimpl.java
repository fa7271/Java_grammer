package Bank;

public class BankCardServiceimpl implements BankService {
    @Override
    public void withdraw() {
        System.out.println("현금 출금");
    }

    @Override
    public void deposit(BankAccount bankAccount, int amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("현금 입금");
        System.out.println(bankAccount.getBalance());
    }

    @Override
    public boolean transfer_deposit(BankAccount bankAccount, String whoNumber1, Integer transferMoney) {

        return false;
    }
}
