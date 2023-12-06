import java.util.stream.IntStream;

public class C05RoopPractice {
    public static void main(String[] args) {

        int sum_A = IntStream.rangeClosed(1,20).filter(x-> x%2==0).sum();


        int sum = 0;
        for(int i = 1; i <= 20; i ++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
