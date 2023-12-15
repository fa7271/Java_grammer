package C12ClassLecture;


// 같은 이름에 다른 변수 -> 메서드 오버로딩
public class C1204Constructor {
    public static void main(String[] args) {
        Calender calender = new Calender("2023", "12", "5");
//        Calender calender1 = new Calender("2023");
        Calender calender2 = new Calender("2023", "12", "5");
        calender.hello();
        // 기본 생성자가 아닌 매개변수를 가진 생성자를 만들면 기본생성자는 호출 불 가능
//        Calender calender1 = new Calender();
    }
}

class Calender {
    private String year;
    private String month;
    private String day;

    // 메소드 오버로딩을 통해 같은 이름의 생성자 생성가능
    public Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Calender(String year) {
        this(year, null, null); // 클래스의 있는 어떤 생성자 , 아무거나 하나 지정,, 매개변수로 구분
    }

//    public Calender(String year, String month) {
//        this.year = year;
//        this.month = month;
//    }
//
//    public Calender(String year) {
//        this.year = year;
//    }


    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public void hello() {
        System.out.println(this.year + "년 " + this.month + "월 " + this.day +"일 ");
    }
}
