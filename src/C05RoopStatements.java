import java.util.Scanner;
import java.util.stream.IntStream;

public class C05RoopStatements {
    public static void main(String[] args) {

        int num = 2;
        while (num <= 10) {
            System.out.println("num = " + num);
            num ++;
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("구구단 단수를 입력해 주세요");
//        int input = sc.nextInt();
//        int idx = 1;
//        while (idx <= 9) {
//            System.out.println(input + " X " + 1 + " = " + input * idx);
//            idx++;
//        }
/*

        String password = "thd123!!@";
        String res = "";
        int i = 0;
        while(i < 5){
            Scanner scanner = new Scanner(System.in);
            String inputs = scanner.nextLine();
            if (inputs.equals(password)) {
                System.out.println("정답!");
                res = password;
                break;
            }else {
                System.out.println("다시 입력해주세요");
            }
            i ++;
        }
        if (res.isEmpty()) System.out.println("입력횟수를 초과 했습니다.");
*/
        int i = 0;
        do {
            System.out.println("시작하겠습니다.");
            i++;
        } while (i < 10);

//        IntStream.rangeClosed(2,10).forEach(System.out::println);

        IntStream.rangeClosed(1,10).filter(x-> x%2==0).forEach(System.out::println);

        for (int a1 = 0; a1 <= 10; a1++) {
            if (a1 % 2 == 0) {
                continue;
            }else System.out.println(a1);
        }


    }
}
