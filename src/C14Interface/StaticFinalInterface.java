package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyInterface myimple = new MyInterfaceImplements();
        myimple.methodA();
        System.out.println(myimple.my_constant);
    }
}

interface MyInterface {
//    아래 변수는 컴파일타임에 static, final이 붙는다.
    int my_constant = 100;
    void methodA();
}

class MyInterfaceImplements implements MyInterface {

    @Override
    public void methodA() {
        System.out.println("MyInterfaceImplements  도착");
    }
}
