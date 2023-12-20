package C13Inheritance;

public class C1304ProtectedTest {
    public static void main(String[] args) {
        C1304ProtectedClass test = new C1304ProtectedClass();

//        default 접근 가능
        System.out.println(test.st2);
//        protected 접근가능
        System.out.println(test.st3);
//        public 접근가능
        System.out.println(test.st4);


    }
}
