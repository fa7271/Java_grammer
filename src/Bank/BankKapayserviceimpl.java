package Bank;

public class BankKapayserviceimpl implements BankService {
    @Override
    public void withdraw() {
        System.out.println("뱅크카카오 출금");
    }

    @Override
    public void deposit(BankAccount bankAccount, int amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("카카오뱅크 입금");
    }

    @Override
    public boolean transfer_deposit(BankAccount bankAccount, String whoNumber1, Integer transferMoney) {

        if (bankAccount.getBalance() < transferMoney) {
            return false;
        }else{
            bankAccount.setBalance(bankAccount.getBalance() - transferMoney);
            return true;
        }
    }
}
