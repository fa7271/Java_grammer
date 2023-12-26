package C17ExceptionFileParsing;

import java.util.Scanner;

public class C1701Exception {
    public static void main(String[] args) {
        int num = 10;
        Scanner sc = new Scanner(System.in);
/*
//        int input = sc.nextInt();
//
//        예외가 발생할 것으로 예상되는 코드에 try catch 감싸준다.
        try {
            System.out.println("10에 " + input + "을 나누면 " + num / input + "입니다.");
//      catch에는 발생가능한 예외사항을 적어야 정상적으로 catch가 된다.
        } catch (IllegalArgumentException e) {
            System.out.println("정상적이지 않은 입력값");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
//            e 안에 예외 관련된 정보들이 들어있음
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("무슨 예외인지 모르겠습니다.");
            e.printStackTrace();
        } finally {
            // 반드시 실행되어야 하는 구문 삽
        }

        System.out.println("감사합니다.");*/

        String password = "1234";
        try {
            login(password);
        } catch (IllegalArgumentException e) {
//            login 메소드에서 throw new 한 곳에서 넘어온 메시지
            System.out.println(e.getMessage());
        }

    }

    // unchecked exception 에서 throws를 하지 않더라도 예외는 호출한 곳으로 전파
    // throws 를 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것 일뿐이다.

//    checked exception은 예외처리가 강제되고, 해당메서드엣 예외처리를 하든지 throws를 통해 호출한 곳에 위임
//    이때에 호출한 쪽에서는 예외처리가 강제된다.
    private static void login(String password) {
        if (password.length() < 10) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다."); //
        }
    }
}
