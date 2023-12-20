package C13Inheritance_test;

import C13Inheritance.C1304ProtectedClass;

public class ProtecteMain extends C1304ProtectedClass {
    public static void main(String[] args) {
        C1304ProtectedClass test = new C1304ProtectedClass();
//        public만 가능
        System.out.println(test.st4);

//        상속관계여도 자식객체를 만들어줘야지 부모에게 접근이 가능함
        ProtecteMain protecteMain = new ProtecteMain();
        System.out.println(protecteMain.st3);
        System.out.println(protecteMain.st4);
    }
}
