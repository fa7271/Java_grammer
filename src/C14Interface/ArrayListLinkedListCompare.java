package C14Interface;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListLinkedListCompare {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            myList.add(0, i);
        }
//        IntStream.rangeClosed(1, 100000).forEach(x -> myList.add(0,x));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);


        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            myList.get(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }
}
