package org.example;

public class current_correct {
    public static int convertTime(String current, String correct) {
        String[] cuurentTime = current.split(":");
        int cuurentHour = Integer.parseInt(cuurentTime[0]);
        int cuurentMinute = Integer.parseInt(cuurentTime[1]);
        String[] correctTime = correct.split(":");
        int correctHour = Integer.parseInt(correctTime[0]);
        int correctMinute = Integer.parseInt(correctTime[1]);
        int count = 0;
        while(cuurentHour != correctHour){
            count++;
            cuurentHour++;
        }
        while (cuurentMinute != correctMinute){
            int diff = correctMinute - cuurentMinute;
            if(diff%15==0){
                count = count + diff/15;
                cuurentMinute = cuurentMinute + (diff);
            } else if (diff%5==0){
                count =count+ diff/5;
                cuurentMinute = cuurentMinute + (diff);
            }else {
                count = count + diff;
                cuurentMinute = cuurentMinute + (diff);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a = convertTime("11:00","11:01");
        System.out.println(a);
    }
}
