public class C1101StackFunction1 {
    public static void main(String[] args) {
        System.out.println(" main 함수 시작 ");
        function1();
        System.out.println("main 함수 끝");
    }

    static void function2() {
        System.out.println("function2 시작");
        System.out.println("function2 끝");
    }

    static void function1() {
        System.out.println("function 시작");
        function2();
        System.out.println("function 끝");
    }
}
