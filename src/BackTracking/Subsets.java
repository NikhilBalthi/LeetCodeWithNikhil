package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private static void backtrack(int[] nums, int start,
                                  List<Integer> curr,
                                  List<List<Integer>> res) {

        res.add(new ArrayList<>(curr)); // Add current subset

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);              // Choose
            backtrack(nums, i + 1, curr, res); // Explore
            curr.remove(curr.size() - 1);  // Unchoose
        }
    }
}