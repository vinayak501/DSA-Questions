package org.example;

public class highest_altitude {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int n = gain.length;
        int ans = 0;
        for (int i=0;i<n;i++){
            curr = curr + gain[i];
            ans = Math.max(curr,ans);
        }
        return ans;
    }
}
