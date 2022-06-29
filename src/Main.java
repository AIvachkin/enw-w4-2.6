import java.util.*;

public class Main {

    static List<Integer> nums = new ArrayList<>(List.of(1, 2, 8, 14, 1, 5, 8, 2, 3, 4, 1, 4, 5, 5, 6, 7));

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(nums);
        List<Integer> numsTemp = new ArrayList<>();
        numsTemp.addAll(set);
        Collections.sort(numsTemp);
        for (Integer integer : numsTemp) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }

        }
        task2 ();
    }

    public static void task2() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num ;
            }
        }
    }
}