package C13Inheritance;

// extends 를 통해 상속관계를 표
public class C1301Inheritance extends Parents {
    int c = 10;

    public static void main(String[] args) {
//        부모 꺼 사용하려면 객체 생성해야함.
        C1301Inheritance ih = new C1301Inheritance();

        System.out.println(ih.c);
        System.out.println(ih.a);
//        자식 클래스여도 private 변수는 상속 및 접근이 불가능하다.
//        System.out.println(ih.b);

        ih.parentMethod();
        ih.childMethod();
    }

    void childMethod() {
        System.out.println("자식 클래스 입니다. ");
    }
// 부모메서드의 메서드명을 동일하게 사용함으로서 메소드 오버라이딩 했다.
    void parentMethod() {
        System.out.println("부모가 아니라 자식클래스입니다.");
    }
}

class Parents {
    int a = 10;
    private int b = 20;

    void parentMethod() {
        System.out.println(" 부모 클래스 입니다. ");
    }
}
