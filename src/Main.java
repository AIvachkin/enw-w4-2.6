import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        doTask1();
    }

    private static void doTask1() {
                List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7,0,9)) ;

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

        }
    }
}