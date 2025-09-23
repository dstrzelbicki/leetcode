/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
import java.util.Arrays;

public class alternativeSolution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6}; //modify
        int target = 3; //modify
        boolean thereIsAnswer = false;
        for (int i = 0; i < nums.length; i++) {
            //System.out.println(nums[i] + " from first loop");
            for (int j = 0; j < nums.length; j++) {
                //System.out.println(nums[j] + " from second loop");
                if (nums[i] + nums[j] == target && i != j) {
                    thereIsAnswer = true;
                    System.out.println("There are matching numbers: " + nums[i] + " + " + nums[j] + " = " + target);
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    System.out.println("Indexes: " + Arrays.toString(result));
                }
            }
        }
        if (!thereIsAnswer) {
            System.out.println("There are no matching numbers");
        }
    }
}
