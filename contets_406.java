package org.example;

import java.util.*;

public class contets_406 {
    public String getSmallestString(String s) {
        char[] temp = s.toCharArray();
        for (int i=0;i<temp.length;i++){
            if ((temp[i] % 2) == (temp[i+1] %2)){
                char tem = temp[i];
                temp[i] = temp[i+1];
                temp[i+1] = tem;
                break;
            }
        }
        return new String(temp);
    }


    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> st = new HashSet<>();
        for (int i:nums){
            st.add(i);
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null){
            if (st.contains(curr.next.val)){
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int horizontalpiece = 1, verticalpiece = 1;
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int i = horizontalCut.length - 1, j = verticalCut.length - 1;
        int res = 0;
        while (i >= 0 && j >= 0) {
            if (horizontalCut[i] < verticalCut[j]) {

                verticalpiece++;
                res += (horizontalpiece * (verticalCut[j]));
                j--;
            } else {

                horizontalpiece++;
                res += (verticalpiece * (horizontalCut[i]));
                i--;
            }
        }

        while (i >= 0) {
            horizontalpiece++;
            res += (verticalpiece * (horizontalCut[i]));
            i--;
        }

        while (j >= 0) {
            verticalpiece++;
            res += (horizontalpiece * (verticalCut[j]));
            j--;
        }
        return res;
    }
}
