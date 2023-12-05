import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {

//        int a = 20;
//        //ln -> 줄바꿈
//        System.out.println("a = " + a);
//        String myString = "hello world";
//
////      문자열과 숫자 합치기 >> 문자열로 합쳐진다.
//        System.out.println(a + myString);


//        System.out.println(10+20);

//        입력 : System.in(키보드 입력) + Scanner(입력을 위한 클래스)
        Scanner myScan = new Scanner(System.in);
/*
        System.out.println("아무 문자열을 입력해주세요");
        String inputs = myScan.nextLine();
        System.out.println("사용자가 입력한 문자열 :" + inputs);

//      nextInt 입력 받은 데이터를 한 줄 읽어서, int로 리턴
        int inputs_int = myScan.nextInt();
        System.out.println("사용자가 입력한 숫자는 " + inputs_int);
*/
       /* int inputs_int = myScan.nextInt();
        System.out.println("사용자가 입력한 숫자는 " + inputs_int);

        int inputs_int1 = myScan.nextInt();
        System.out.println("사용자가 입력한 숫자는 " + inputs_int1);

        int res = inputs_int1 + inputs_int;
        System.out.println("입력하신 두 수를 더한 값은 " + res);*/

//        1. nextDouble 을 통해서 소수점 입력 후 출력해 주세요
//        2. 참/ 거짓 -> boolean  -> nextBoolean 을 통해 true/false 입력후 출력

//        Double inputs_Double1 = myScan.nextDouble();
//        System.out.println("사용자가 입력한 숫자는 " + inputs_Double1);
//        Double inputs_Double2 = myScan.nextDouble();
//        System.out.println("사용자가 입력한 숫자는 " + inputs_Double2);

/*        boolean b1 = myScan.nextBoolean();
        System.out.println("b1 = " + b1);
        boolean b2 = myScan.nextBoolean();
        System.out.println("b2 = " + b2);*/

//        입출력 시스템 메모리 해제
        myScan.close();


    }
}
