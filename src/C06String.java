import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C06String {
    public static void main(String[] args) {

//        참조자료형 : 기본 자료형을 제외한 모든 자료형
//        Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스

//        int와 Integer 간의 형 변환
        int a = 10;

        Integer b = new Integer(20);

//        오토언박싱 Integer -> Int
        int c = b;

//        언박싱 Integer -> Int
        int d = b.intValue();

//        오토 박싱
        Integer e = a;

//        String 과 Int 형 변환
        int A = 10;
        String st_A = Integer.toString(A);
        String st_B = String.valueOf(a);
        System.out.println("st_A = " + st_A); // "10"
        System.out.println("st_B = " + st_B);
        int C = Integer.parseInt(st_A); // 10

        // 참조자료형에 원시자료형을 담을 때는 wrapper(Integer) 클래스를 써야한다.
        // 컬렉션 프레임워크 (list, set )
        ArrayList<Integer> list_a = new ArrayList<>(); // 참조자료형
        list_a.add(10); // 원시자료형
        list_a.add(20);
        list_a.add(30);
        System.out.println("list_a = " + list_a);

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        //문자열길이 : length();
        String mySt = "hello";
        System.out.println(mySt.length());

        // indexof : 특정 문자열의 위치 반환
        String myST2 = "hello java";
        System.out.println(myST2.indexOf("java"));

        // contains : 특정 문자열 포함여부
        System.out.println(myST2.contains("java"));

        // charAt : 문자열에서 특정 위치의 문자를 리턴
        String aa = "absdvas";
        char mychar = aa.charAt(1);
        int count = 0;
        for (int i = 0; i < aa.length(); i++) {
        if (aa.charAt(i) == 'a') {
                count ++;
            }
        }
        System.out.println("count = " + count);

        // substring (a,b) a이상 b미만의 index를 자른다.
        String st1 = "hello world";
        System.out.println(st1.substring(0,5));


        // replace : 문자열중에 특정 문자열을 바꿔 새로운 문자열을 return

        // replaceAll : 위와 동일, 정규식 사용가능
        String s = "ac7ed";
        int lens = s.length(); // 5
        System.out.println(s.substring(((lens-1)/2) ,(lens/2)+1));

        String AA = "Hello";
        String a1 = AA.toLowerCase();
        String a2 = AA.toUpperCase();
        System.out.println("a2 = " + a2);
        System.out.println("a1 = " + a1);

        String AAA = "Hello";
        AAA += " world";
        System.out.println(AAA);

        char ch1 = 'a';
        String ST1 = Character.toString(ch1);

        String str = "01송보석abc";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp < 'a' || temp > 'z') {
                str2 += temp;
            }
        }

        System.out.println("str2 = " + str2);

        String regex = "hello world ";
        String str4 = regex.replaceAll("^[a-z]*$","0");
        System.out.println("str4 = " + str4);
        System.out.println(regex.replace("world","java"));
        System.out.println(regex.replaceAll("world", "python"));

        String regex1 = "01abcABC123한글123";
        // 소문자 알파벳
        String s5 = regex1.replaceAll("[a-z]","");
        System.out.println("s5 = " + s5);

        // 한글
        String s6 = regex1.replaceAll("[가-힣]","");
        System.out.println("s6 = " + s6);

        // 숫자
        String s7 = regex1.replaceAll("[0-9]", "");
        System.out.println("s7 = " + s7);

        // 알파벳 전체
        String s8 = regex1.replaceAll("[a-zA-Z]", "");
        System.out.println("s8 = " + s8);

        // 알파벳전체와 숫자
        String s9 = regex1.replaceAll("[a-zA-z0-9]", "");
        System.out.println("s9 = " + s9);

        // Patter클래스
        boolean matches = Pattern.matches(".*[a-z]+.*","helloworld");
        System.out.println("matches = " + matches);

        // 전화번호 인증
        boolean matches2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-7751-7271");
        System.out.println(matches2);

        // 이메일 인증
        boolean matches3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "fa7271@naver.com");
        System.out.println("matches2 = " + matches3);
        
        // split
        String split_a = "a:b:c:d";
        String split_b = "a b c  d";

        String [] sp_arr = split_a.split(":");
        List<String> list = Arrays.asList(split_a.split(":"));

        System.out.println("list = " + list);
        System.out.println("Arrays.toString(sp_arr) = " + Arrays.toString(sp_arr));

        // 공백 여러개 자르기
        String[] sp_arr2 = split_b.split("\\s+");
        System.out.println("sp_arr2 = " + Arrays.toString(sp_arr2));

/*        String str_null = null;
        String str_null1 = "";

        System.out.println(str_null == null);
        System.out.println(str_null1 == null);

        //nullpointer exception 발생
        System.out.println(str_null.isEmpty());
        System.out.println(str_null1.isEmpty());

        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "world";*/


//        String.join(지정구문자, 문자배열);
        String[] arr2 = {"song", "bo", "seok"};
        System.out.println(String.join(" ", arr2));

//        StringBuffer 는 문자열을 추가하거나 변경 할 때 주로 사용하는 객체
        StringBuffer buf = new StringBuffer();
        buf.append(" java");
        buf.append("world");
        String new_str = buf.toString();
        System.out.println("new_str = " + new_str);


        StringBuffer sb1 = new StringBuffer("hello");

        sb1.append(" world");
        System.out.println("sb1 = " + sb1);

        sb1.insert(5, " java");
        System.out.println("sb1 = " + sb1);

        System.out.println(sb1.substring(6,10));
        System.out.println("sb1 = " + sb1);
        sb1.delete(6, 10);
        System.out.println("sb1 = " + sb1);


        StringBuilder sb2 = new StringBuilder("hello");
        sb2.append("world");
        System.out.println(sb2);

        String myString = "hello";
        int n = 3;
        StringBuffer sb3 = new StringBuffer();


        String AAAA = "hello";
        String BBBB = "ohell";

        String[] listA = AAAA.split("");
        String[] listB = BBBB.split("");

        List<String> listAA = Arrays.asList(listA);
        List<String> listBB = Arrays.asList(listB);

        int cout = 0;
        for (int i = 0; i < listAA.size(); i++) {
            Collections.rotate(listAA,1);
            cout ++;
            if (String.join("",listAA) == String.join("",listBB)){
                System.out.println(cout);
                break;
            }else{
                System.out.println(cout);
                break;
            }
        }
    }

}
//for i in range(len(A)):
//        deque_A.rotate(1)
//        count += 1
//        if deque_A == deque_B:
//        return count
//        else: return -1
