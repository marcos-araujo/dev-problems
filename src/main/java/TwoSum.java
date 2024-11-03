import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumBruteForce(new int []{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSumTwoPassHashTable(new int []{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSumOnePassHashTable(new int []{2,7,11,15},9)));
    }

    private static int[] twoSumBruteForce(int[] nums, int target) {
        for (int x = 0; x < nums.length - 2; x++)
            for (int y = 1; y < nums.length - 1; y++)
                if (nums[x] + nums[y] == target)
                    return new int [] {x,y};
        return null;
    }

    private static int[] twoSumTwoPassHashTable(int[] nums, int target) {
        var hashMap = new HashMap<Integer, Integer>();

        for (int x = 0; x < nums.length; x++)
            hashMap.put(nums[x], x);

        for (int x = 0; x < nums.length; x++) {
            int complement = target - nums[x];
            if (hashMap.containsKey(complement) && hashMap.get(complement) != x)
                return new int [] {x,hashMap.get(complement)};
        }

        return null;
    }

    private static int[] twoSumOnePassHashTable(int[] nums, int target) {
        var hashMap = new HashMap<Integer, Integer>();
        for (int x = 0; x < nums.length; x++) {
            int complement = target - nums[x];
            if (hashMap.containsKey(complement))
                return new int [] {hashMap.get(complement), x};
            else
                hashMap.put(nums[x],x);
        }
        return null;
    }

}