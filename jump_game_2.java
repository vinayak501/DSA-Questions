package org.example;

public class jump_game_2 {
    static int jump(int[] nums) {
        int destination = nums.length-1;
        int coverage = 0;
        int lastJumpIndex = 0;
        int totaljumps=0;
        for (int i=0;i<nums.length;i++){
            coverage = Math.max(coverage,i+nums[i]);

            if(lastJumpIndex == i){
                lastJumpIndex = coverage;
                totaljumps++;
                if (coverage>=destination){
                    return totaljumps;
                }
            }
        }
        return totaljumps;

    }

    public static void main(String[] args) {
        int [] nums= {2,4,1,2,3,1,1,2};
        System.out.println(jump(nums));
    }
}
