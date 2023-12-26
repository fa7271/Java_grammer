package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C1602Calender {
    public static void main(String[] args) {
//        날짜 관련 클래스의 종류 : Calender(java.util), java.time패키지 안에 있는 Local~ 패키지
        Calendar time = Calendar.getInstance();
        System.out.println(time.getTime());

//        특정한 숫자값은 get함수의 Input값으로 주어 원하는 날짜 정보를 출력할 수 있게 해준다.
        System.out.println(time.get(Calendar.YEAR));
        System.out.println(time.get(Calendar.MONTH)+1);
        System.out.println(time.get(Calendar.DAY_OF_MONTH));
        System.out.println(time.get(Calendar.DAY_OF_WEEK));

        System.out.println(time.get(Calendar.HOUR));
        System.out.println(time.get(Calendar.MINUTE));
        System.out.println(time.get(Calendar.SECOND));

        LocalTime present_time = LocalTime.now();
//        System.out.println("present_time = " + present_time); // 10:10:56.868288

        LocalDateTime present_time1 = LocalDateTime.now();
//        System.out.println("present_time1 = " + present_time1);// 2023-12-26T10:10:56.903794

        LocalDate present_time2 = LocalDate.now();
//        System.out.println("present_time2 = " + present_time2); //2023-12-26

//        임의로 특정시간을 만들어 내고 싶을때 : of 메서드 사용
        LocalDate birthday = LocalDate.of(1996, 02, 11);
//        일반 내장 메서드
//        System.out.println(birthday.getYear()); // 1996
//        System.out.println(birthday.getMonth()); // 02
//        System.out.println(birthday.getDayOfMonth()); // 11

        LocalTime birthday2 = LocalTime.of(22, 02, 11);

        LocalDateTime x = LocalDateTime.of(birthday, birthday2); // 1996-02-11T22:02:11

//        크로노 필드 : enum필드 타입 사용 매개변수로 크로노필드를 받아 프로그램의 유연성 향상.
        System.out.println(x.get(ChronoField.YEAR));
        System.out.println(x.get(ChronoField.MONTH_OF_YEAR));
//        0: 오전, 1 : 오후
        System.out.println(present_time.get(ChronoField.AMPM_OF_DAY) == 0 ? "오전입니다" : "오후입니다");

    }
}
