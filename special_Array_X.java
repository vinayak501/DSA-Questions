package org.example;

public class special_Array_X {

//    ******************************BRUTE FORCE ************************************************
//    public int specialArray(int[] nums) {
//        int n = nums.length;
//        int x=0;
//        while(x<n){
//            int ans = 0;
//            for (int i : nums){
//                if(i >= x) ans++;
//            }
//            if (ans == x) return ans;
//            x++;
//        }
//        return -1;
//    }


//    ******************************************BINARY SEARCH*******************************************************
    public int lowerBound(int[] nums,int x){
        int left = 0;
        int right = nums.length;
        while (right > left){
            int mid = left + (right - left)/2;
            if (nums[mid] >= x){
                right = mid;
            }else {
                left = mid +1;
            }
        }
        return left;
    }
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<=n ;i++){
            int lb = lowerBound(nums,i);
            if(n - lb == i){
                return i;
            }
        }
        return -1;
    }

}
