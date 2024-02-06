package org.example;

public class coins_change_tabulation {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int prev[] = new int[amount + 1];
        int cur[] = new int[amount + 1];

        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0)
                prev[i] = i / coins[0];
            else
                prev[i] = (int) Math.pow(10, 9);
        }

        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= amount; target++) {
                int notTake = 0 + prev[target];
                int take = (int) Math.pow(10, 9);

                if (coins[ind] <= target)
                    take = 1 + cur[target - coins[ind]];

                cur[target] = Math.min(notTake, take);
            }

            prev = cur.clone();
        }

        int ans = prev[amount];

        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }
}
