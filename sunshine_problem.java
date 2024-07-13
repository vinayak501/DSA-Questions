package org.example;

public class sunshine_problem {
    public boolean circularArrayLoop(int[] nums) {
        if(nums.length <= 1){
            return false;
        }
        for (int i=0;i<nums.length;i++){
            int slow,fast;
            slow = fast = i;
            boolean isForward = nums[i]>0;
            while (true){
                slow = getNextPosition(nums,slow,isForward);
                if (slow == -1){
                    break;
                }
                fast = getNextPosition(nums,fast,isForward);
                if (fast == -1){
                    break;
                }
                fast = getNextPosition(nums,fast,isForward);
                if (fast == -1){
                    break;
                }
                if (slow == fast){
                    return true;
                }
            }
        }
        return false;
    }

    private static int getNextPosition(int[] arr, int index, boolean ifForward) {
        boolean direction = arr[index] >= 0;

        if(direction != ifForward) {
            return -1;
        }

        int nextIndex = (index + arr[index]) % arr.length;

        if(nextIndex < 0) {
            nextIndex = nextIndex + arr.length;
        }

        if(nextIndex == index) {
            return -1;
        }

        return nextIndex;
    }

}
