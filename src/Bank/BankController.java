package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankController {
    static ArrayList<BankAccount> members = new ArrayList<>();
    public static void main(String[] args) {
        BankAccount me = new BankAccount("1111", 1);
        BankService BCS = new BankCardServiceimpl();
        BankService BKS = new BankKapayserviceimpl();
//        BCS.deposit(me, 2);


        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("1.양심있는 회원가입 2. 로그인 ");
            int input = Integer.parseInt(sc.nextLine());
            if (input == 1) {
                String account_number1 = sc.nextLine();
                Integer money = Integer.valueOf(sc.nextLine());
                BankAccount newmember = new BankAccount(account_number1, money);
                members.add(newmember);
                System.out.println("회원가입 성공");
            } else if (input == 2) {
//                비번 없음
                System.out.println("계좌번호를 입력해주세요");
                String id = sc.nextLine();

                BankAccount loginok = longid(id);
                if (loginok == null) {
                    System.out.println("로그인실패");
                    break;
                }
                else {
                    System.out.println("로그인 성공");
                }

                System.out.println("1. 카카오 입금 , 2. 현금입금 3. 잔고확인 4.계좌이체 5.끝");

                int next_input = Integer.parseInt(sc.nextLine());
                if (next_input == 1) {
                    System.out.println("카카오 입금을 선택하셨습니다. 얼마를 넣으실건가요?");
                    int deposit_money = Integer.parseInt(sc.nextLine());
                    BKS.deposit(loginok, deposit_money);
                    System.out.println(loginok.getBalance());
                } else if (next_input == 2) {
                    continue;
                } else if (next_input == 3) {
                    continue;
                } else if (next_input == 4) {
                    System.out.println("누구 계좌로 입급하시겠습니까");
                    String who_number1 = sc.nextLine();

                    System.out.println("얼마 입급하시겠습니까");
                    Integer transfer_money = Integer.valueOf(sc.nextLine());

                    System.out.println(" 1.카카오 2.현금? ?");
                    int choose = Integer.parseInt(sc.nextLine());
                    if (choose == 1) {
                        boolean idok = findbyid(who_number1);
                        if (idok == false) {
                            System.out.println("아이디 없습니다");
                            break;
                        }
                        boolean flag = BKS.transfer_deposit(loginok,who_number1, transfer_money);
                        if (flag == false) {
                            System.out.println("돈 부족한대용?");
                        }else{
                            System.out.println("성공인데용?");
                            System.out.println(loginok.getBalance() + "남았습니다");
                        }
                    } else if (choose == 2) {
                        BCS.transfer_deposit(loginok,who_number1, transfer_money);
                    }
                    else break;

                } else break;
            }
        }
    }

    private static BankAccount longid(String id) {
        BankAccount foundMember = members.stream()
                .filter(member -> id.equals(member.getAccount_number()))
                .findFirst()
                .orElse(null);
//        for (BankAccount member : members) {
//            if (id.equals(member.getAccount_number())) {
//                return member;
//            }
//        }
//        return null;
        return foundMember;
    }


    private static boolean findbyid(String whoNumber1) {
        boolean exists = members.stream()
                .anyMatch(member -> whoNumber1.equals(member.getAccount_number()));
        return exists;
    }
}

//                for (BankAccount member : members) {
////                    계좌 있으면
//                    if (member.getAccount_number().equals(id)) {
//                        System.out.println("로그인 성공");
//                        bank_account = member;
//                        break;
//                    }
//                    else {
//                        System.out.println("로그인실패");
//                    }
//                }