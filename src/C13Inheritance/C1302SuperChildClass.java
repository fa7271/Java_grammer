package C13Inheritance;


// super() 부모생성자 호출
// super 부모 클래스 그 자체
public class C1302SuperChildClass extends SuperParents{
    int b;
    int a ;
    C1302SuperChildClass() {
        super(100);
        a = 20;
    }

    void display() {
        System.out.println(a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        C1302SuperChildClass sc = new C1302SuperChildClass();
        sc.display();
    }
}

class SuperParents {
    int a;

    public SuperParents(int a) {
        this.a = a;
    }
}
