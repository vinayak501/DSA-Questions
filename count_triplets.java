package org.example;

public class count_triplets {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        for (int i=1;i<=n;i++){
            prefix[i] = prefix[i-1] ^ arr[i-1];
        }

        int triplet = 0;
        for (int i=0;i<prefix.length;i++){
            for (int k=i+1;k<prefix.length;k++){
                if (prefix[i] == prefix[k]){
                    triplet += k - i - 1;
                }
            }
        }
        return triplet;
    }
}
