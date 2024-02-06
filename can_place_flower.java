package org.example;

public class can_place_flower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int count = 0;
        int l = flowerbed.length;
        for (int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0){
                if (i == 0 && l >1) {
                    if (flowerbed[i+1] == 0){
                        count++;
                        flowerbed[0] = 1;
                    }
                }else if( i == l-1 && l > 1){
                    if (flowerbed[i-1] == 0) {
                        count++;
                        flowerbed[n-1] = 1;
                    }
                }else if(i!=0 && i!=l-1 && n>2){
                    if(flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                        count++;
                        flowerbed[i] = 1;
                    }
                }
                if (count >= n) return true;
            }
        }
        return false;
    }
}
