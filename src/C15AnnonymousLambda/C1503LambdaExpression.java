package C15AnnonymousLambda;

public class C1503LambdaExpression {
    public static void main(String[] args) {
//        실행문 2개 이상일 경우에는 return 필요
//        1개일경우에는 return 생략

//        매개변수를 순서로 인지하므로, 타입을 지정해 줄 필요는 없다.
        LamdaInterface Li = (x, y, k) -> {
            String answer = x + y;
            return answer;
        };
        System.out.println(Li.makeString("송보석", "배수지", "김우빈"));

    }
}

interface LamdaInterface {
    String makeString(String a, String b, String c);

}