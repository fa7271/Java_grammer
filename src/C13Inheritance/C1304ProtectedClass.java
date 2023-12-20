package C13Inheritance;

public class C1304ProtectedClass {

//    public  : 프로젝트 전체에서 접근가능
//    protected : 패키지를 벗어나더라도 상속관계인 경우엔 접근가능
//    default : 패키지 내에서만 접근 가능
//    private : 클래스내에서만 접근가능

    private String st1 = "hello1";
    String st2 = "hello2";
    protected String st3 = "hello3";
    public String st4 = "hello4";

    public static void main(String[] args) {
        C1304ProtectedClass c0304ProtectedClass = new C1304ProtectedClass();

    }
}

