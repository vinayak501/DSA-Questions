package org.example;

public class unable_to_eat_lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int[] count = new int[2];
        for (int x : students) count[x]++;
        for (int i=0;i<n;i++){
            if (count[sandwiches[i]] == 0) return n-i;
            count[sandwiches[i]]--;
        }
        return 0;
    }
}
