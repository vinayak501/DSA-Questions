package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Find_the_Difference_of_Two_Arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l1 = IntStream.of(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2 = IntStream.of(nums2).boxed().collect(Collectors.toList());
        Arrays.asList(nums2);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            if (!l2.contains(l1.get(i)) && !list1.contains(l1.get(i))) {
                list1.add(l1.get(i));
            }
        }
        for (int i = 0; i < l2.size(); i++) {
            if (!l1.contains(l2.get(i)) && !list2.contains(l2.get(i))) {
                list2.add(l2.get(i));
            }
        }
        res.add(list1);
        res.add(list2);
        return res;
    }
}
