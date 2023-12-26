package C16EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class C1604Iterator {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");
//        for (String x : myList) {
//            System.out.println(x);
//        }

//        iterator사용: 참조하고 있는 원본데이터 삭제 가능 -> remove
        System.out.println(myList.iterator().hasNext());
        Iterator<String> myiter = myList.iterator();
        while (myiter.hasNext()) {
            if (myiter.next().equals("banana")) {
                myiter.remove();
            }
        }
        System.out.println(myList);
    }
}

//1,000,000