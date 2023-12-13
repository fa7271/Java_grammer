public class C1101StackFunction2 {
    public static void main(String[] args) {
        System.out.println(" main 함수 시작 ");
        System.out.println(function1(1));
        System.out.println("main 함수 끝");
    }
    static int function1(int a) {
        System.out.println("function 시작");
        System.out.println("function 끝");
        System.out.println("a = " + a);
        return function1(a*2);
    }
    static int function2(int a) {
        System.out.println("function2 시작");
        System.out.println("function2 끝");
        return a*2;
    }
}
