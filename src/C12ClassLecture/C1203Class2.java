package C12ClassLecture;


import java.util.regex.Pattern;

public class C1203Class2 {

    public static void main(String[] args) {
//        Person person = new Person();

       /* person.setName("송보석", "fa7271@naver.com", 7271, 10);
        person.Whois();

        person.name = "송보석";
        person.age = 10;
        person.password = 7271;
        person.email = "fa7271@navr.com";

        person.Whois();
        person.email = "windy7271@naver.com";
        person.Whois();

        // 변수값에 직접 접근하여 값을 할당하는 방식
        Person myperson1 = new Person();
        myperson1.name = "홍길동";
        myperson1.email = "hong@nave.com";
        myperson1.age = 20;
        myperson1.person_total += 1;
        System.out.println(myperson1.Whois1());

        Person person2  = new Person();
        person2.name = "송명석";
        person2.email = "fa7279@naver.com";
        person2.age = 34;
        Person.person_total += 1;
        System.out.println("person2 = " + person2.Whois1());*/

        Person person = new Person();
        person.setName("송보석");
        person.setemail("fa7271@naver.com");
        person.setPassword(7271);
        person.setAge(10);

        System.out.println("이름: " + person.getName());
        System.out.println("이메일: " + person.getemail());
        System.out.println("비밀번호: " + person.getPassword());
        System.out.println("나이: " + person.getAge());

        // 정보 출력
//        person.Whois();

        Person person1 = new Person();
        person1.setName("송보석");
        person1.setemail("fa7271naver.com");
        person1.setPassword(7271);
        person1.setAge(21);


        System.out.println("이름: " + person1.getName());
        System.out.println("이메일: " + person1.getemail());
        System.out.println("비밀번호: " + person1.getPassword());
        System.out.println("나이: " + person1.getAge());
//        person1.Whois();


    }
}
class Person {

//    private name 으로 할 경우
//    person.setName("송보석", "fa7271@naver.com", 7271, 10); 으로 접근
//    person.name 이렇게 직접 접근은 불가능하다.
//    private 가 없으면 검증이 불가능하다. 예를들면 글자수 체크, 비밀번호 체크,

    private String name;
    private String email;
    private int password;
    private int age;
    static int person_total;

//    public void Whois() {
//        System.out.println("name : " + this.name + " email :" + this.email + " password :" +this.password + " age :" + this.age);
//    }
//    String Whois1() {
//        return "이름은 :" + this.name + " 나이는 " + this.age + " 입니다.";
//    }
    // setter getter 생성


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 10) {
            System.out.println(" 이름이 너무 길어요");
        }
        else this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {

        if (Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", email)) {
            this.email = email;
        }else System.out.println("틀린 이메일 형식입니다.");
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 20) {
            System.out.println("나이가 20살 미만입니다.");
        } else this.age = age;
    }

}
