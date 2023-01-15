package Arrays;
import java.util.*;

public class ThreeNumberSum {
    public static int[] threeNumberSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                if (set.contains(nums[i] + nums[j])) {
                    return new int[]{nums[i], 0 - nums[i] - nums[j], nums[j]};
                }
                set.add(0 - nums[j]);
            }
        }
        return new int[0];
    }

    public static void test() {
        System.out.println(Arrays.toString(threeNumberSum(new int[0])));
        System.out.println(Arrays.toString(threeNumberSum(new int[]{-1, 0, 1})));
        System.out.println(Arrays.toString(threeNumberSum(new int[]{-1, -1, 1, 1, 0, 0})));
        System.out.println(Arrays.toString(threeNumberSum(new int[]{-5, -1, 0, 1, 4, -1})));
        System.out.println();
    }
}
