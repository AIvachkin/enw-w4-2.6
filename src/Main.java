import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 8, 14, 1, 5, 8, 2, 3, 4, 1, 4, 5, 5, 6, 7));
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
    }
}