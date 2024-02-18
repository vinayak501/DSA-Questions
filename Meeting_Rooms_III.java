package org.example;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_III {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int[] roomUsedCount = new int[n];
        long[] lastAvailableAt = new long[n];
        for (int[] meeting :meetings){
            int start = meeting[0];
            int end = meeting[1];
            boolean found = false;
            long earlyEndingTime = Long.MAX_VALUE;
            int earlyEndingRomm = 0;
            for (int room=0;room<n;room++){
                if (lastAvailableAt[room] <= start){
                    lastAvailableAt[room] = end;
                    found = true;
                    roomUsedCount[room]++;
                    break;
                }
                if (earlyEndingTime > lastAvailableAt[room]){
                    earlyEndingTime = lastAvailableAt[room];
                    earlyEndingRomm = room;
                }
            }
            if (!found){
                lastAvailableAt[earlyEndingRomm] += (end - start);
                roomUsedCount[earlyEndingRomm]++;
            }
        }
        int resultRoom = -1;
        int maxUse= 0;
        for (int room=0;room<n;room++){
            if (roomUsedCount[room] > maxUse){
                resultRoom = room;
                maxUse = roomUsedCount[room];
            }
        }
        return resultRoom;
    }

// ***************************************** PRIORITY QUEUE *******************************************************

    public int mostBooked_PriorityQueue(int n, int[][] meetings) {
        // sort by starting time of meetings
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        // Each room is used 0 times in the beginning
        int[] roomsUsedCount = new int[n];

        // To store {earliest room empty time, room No.}
        PriorityQueue<long[]> usedRooms = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        // To store rooms that are used
        PriorityQueue<Integer> unusedRooms = new PriorityQueue<>();
        for (int room = 0; room < n; room++) {
            unusedRooms.add(room); // All rooms are unused in the beginning
        }

        for (int[] meet : meetings) {
            int start = meet[0];
            int end = meet[1];

            // First see, by this time, which rooms can be empty now
            // And move them to unusedRooms
            while (!usedRooms.isEmpty() && usedRooms.peek()[0] <= start) {
                int room = (int) usedRooms.poll()[1];
                unusedRooms.add(room);
            }

            if (!unusedRooms.isEmpty()) {
                int room = unusedRooms.poll();
                usedRooms.add(new long[]{end, room});
                roomsUsedCount[room]++;
            } else { // We don't have any room available now. Pick the earliest end room
                int room = (int) usedRooms.peek()[1];
                long endTime = usedRooms.poll()[0];
                usedRooms.add(new long[]{endTime + (end - start), room});
                roomsUsedCount[room]++;
            }
        }

        int resultRoom = -1;
        int maxUse = 0;
        for (int room = 0; room < n; room++) {
            if (roomsUsedCount[room] > maxUse) {
                maxUse = roomsUsedCount[room];
                resultRoom = room;
            }
        }

        return resultRoom;
    }
}
