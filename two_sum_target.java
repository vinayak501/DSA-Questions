package org.example;

public class two_sum_target {
    public int[] twoSum(int[] numbers, int target) {
//        int i=0,j=0;
//        while (i<numbers.length){
//            while (j<numbers.length){
//                if(i==j){
//                    j++;
//                }else {
//                    int[] answer = new int[]{i, j};
//                    if(numbers[i]+numbers[j]==target) return answer;
//                    j++;
//                }
//                i++;
//            }
//        }
//        return null;
        int l=0,r=numbers.length;
        while (numbers[l] + numbers[r] != target){
            if (numbers[l] + numbers[r] > target) r--;
            else l++;
        }
        return new int[]{l+1,r+1};
    }
}
