package C12ClassLecture;

public class BankAccount {
    public static void main(String[] args) {
        person_BankAccount PBA = new person_BankAccount("3333-08-0156352");

        PBA.setAccount_number("3333-08-0156352");
//        PBA.setBalance(100000000);
        PBA.deposit(100000000);
        PBA.withdraw(100000001);

    }
}

class person_BankAccount {
    private String account_number;
    private int balance;

//     별도의 생성자를 만들지 않으면 매개변수없는 기본 생성자가 숨겨져 있다.
//    생성자란 클래스 객체화 될때 자동으로 실행되는 메서드
//    클래스명(){} : 생성자의 형태

    person_BankAccount(String account_number) { // setter 차이가 뭐임
        this.account_number = account_number;
    }
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    void deposit(int money) {
        this.balance += money;
        System.out.println("당신이 가지고 있는 돈은 :" + this.balance + "입니다");
    }

    void withdraw(int money) throws IllegalArgumentException {
        if (this.balance < money) {
            throw new IllegalArgumentException("잔액이 부족해요");
        }else this.balance -= money;
        System.out.println(money +" 출금 됐습니다. ");
    }

    int checkBalance() {
        return this.balance;
    }
}

