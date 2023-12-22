package C15AnnonymousLambda;

public class C1501InnerClass {

    public static void main(String[] args) {
        MemberInnerClass.staticInnerClass si = new MemberInnerClass.staticInnerClass();
        si.display();

    }
}

// 일반 내부 클래스
class MemberInnerClass{
    static int a = 10;
    static private int b =10;

    // 이 클래스는 C1501InnerClass의 정적멤버처럼 활용 된다.
    static class staticInnerClass {
        private int data;

        void display() {
            System.out.println("data 값은" + data + a + " 입니다.");
            System.out.println(b);
        }

    }

}