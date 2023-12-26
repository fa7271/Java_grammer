package C16EtcClass;

import java.util.Calendar;

public class C1606EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("song");
        s1.setClassGrade("first");

        EnumStudent s2 = new EnumStudent();
        s2.setName("hong");
        s2.setClassGrade(Grade.a1);

        EnumStudent s3 = new EnumStudent();
        s3.setName("hong");

        EnumStudent s4 = new EnumStudent();
        s4.setName("hong5");
//        String 으로는 세팅 불가.
//        Enum 사용시에는 static final 변수와 동일한 방법으로 사용
        s4.setRole(Role.ADMIN);
        System.out.println(s4.getRole());
        System.out.println(s4.getRole().getClass());
//        enum 값 내부에는 저장된 순서대로 0부터 인덱스 값이 내부적으로 할당
        System.out.println(s4.getRole().ordinal());
    }
}
// 열거형 상수는 , 로 구분하고 상수 목록 끝에는 세미클론으로 마무리.
// String 타입이 아닌 Roel타입을 신규로 저장한다.
enum Role {
    GENERAL_USER,
    ADMIN,
    SUPER_USER;
}
class Grade {
    static final String a1 = "FISRT_GRADE";
    static final String a2 = "SECOND_GRADE";
    static final String a3 = "THIRD_GRADE";

}
class EnumStudent {
    private String name;
    private String classGrade;
    private Role role;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassGrade() {
        return classGrade;
    }
    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}