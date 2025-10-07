import java.util.Arrays;
import java.util.HashMap;

public class secondSolution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4}; //modify
        int target = 6; //modify
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];

            if (numsMap.containsKey(result)) {
                int[] answer = new int[] { numsMap.get(result), i };
                System.out.println(Arrays.toString(answer));
            }
            numsMap.put(nums[i], i);
        }
    }
}
