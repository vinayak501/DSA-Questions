package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permutations {
    public int n;
    public List<List<Integer>> result;
    private void solve(int idx, int[] nums) {
        if (idx == n) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }
        for (int i = idx; i < n; i++) {
            swap(nums, i, idx);

            solve(idx + 1, nums);

            swap(nums, i, idx);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        n = nums.length;

        solve(0, nums);

        return result;
    }
}
