import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class C04IfStatements {

    public static void main(String[] args) {
        String password = "thd123!!@@";
        System.out.println("비밀번호를 입력해주세요");
        String res = "";


/*

        for (int i = 0; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            String inputs = scanner.nextLine();
            if (inputs.equals(password)) {
                System.out.println("정답!");
                res = password;
            }else {
                System.out.println("다시 입력해주세요");
            }
        }
        if (res.isEmpty()) System.out.println("다시시도해주세요");
*/


    /*    Scanner scanner = new Scanner(System.in);
        char word = scanner.nextLine().charAt(0);
        if( word < 97){
            System.out.println("대문자");
        }
        else System.out.println("소문자");


        */

    /*    System.out.println("버스잔액을 입력해주세요");
        int buscard = scanner.nextInt();
        System.out.println("카드를 가지고 있나요?");
        boolean have_buscard = scanner.nextBoolean();
        if (buscard >= 1500 && have_buscard) {
            System.out.println("정상처리");
        }else System.out.println("탑승불가.");
        */
/*

        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        String result = inputs.equals("thd123!!@@") ? "성공": (inputs.equals("") ? "아무것도 입력 안 했습니다" : "틀렸습니다.");
        System.out.println("result = " + result);
*/
/*
        int my_money = 10000;
        if (my_money <= 10000) {
            System.out.println("택시가넝");
        } else if (my_money <= 3000) {
            System.out.println("버스가넝");
        } else if (my_money <= 2000) {
            System.out.println("킥보드가넝");
        }else System.out.println("걷기가능");

        Scanner scanner = new Scanner(System.in);

        System.out.println("원하시는 번호를 입력해주세요");
        int call = scanner.nextInt();
        switch (call) {
            case 1:
                System.out.println("대출서비스 입니다.");
                break;
            case 2:
                System.out.println("예금");
                break;
            case 0:
                System.out.println("상담사연결");
                break;
            case 3:
                System.out.println("적금");
                break;
            default:
                System.out.println("잘못눌렀습니다.");
                break;
        }
   */


    }
}
