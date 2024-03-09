package org.example;

public class minimum_common_value {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m= nums2.length;
        while (i<n && j<m){
            if (nums1[i] == nums2[j]) return nums1[i];
            if (nums1[i] < nums2[j]) i++;
            else j++;
        }
        return -1;
    }
}
