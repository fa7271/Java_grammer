package C13Inheritance;


// import java.util.*;  : util 하위의 모든 클래스 / 인터페이스 파일 import 가능
// final클래스는 상속이 불가능하다
//public class C1305Others extends FinalClass{
//}
public class C1305Others {
    public static void main(String[] args) {
        C1305Dog myDog = new C1305Dog();
        myDog.makesound1();
        myDog.makesound2();
        C1305Animal myAnimal = new C1305Animal() {
            @Override
            void makesound1() {

            }
        };
        System.out.println(myDog.getClass());
        System.out.println(myAnimal.getClass());
    }
}
final class FinalClass{

}

abstract class C1305Animal {
//    final void makesound() {
//        System.out.println(" 동물은 소리를 냅니다. ");
//    }

    abstract void makesound1();

    void makesound2() {
        System.out.println(" makesound2");
    }
}

class C1305Dog extends C1305Animal{
    @Override
    void makesound1() {
        System.out.println("makesound1");

    }
//    fianl 메소드는 오버라이딩 불가.
    /*    @Override
    void makesound() {
        System.out.println(" 멍멍 ");
    }
    */

}
