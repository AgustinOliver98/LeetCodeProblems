package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingsRooms {

    public static void MeetingRoomsSolution(){
        int[][] intervals = new int[][]{{8, 10}, {8, 10}, {9, 11},{15,18},{8,10}};
        Arrays.sort(intervals, Comparator.comparing((int[] interval) -> interval[0]));
        int endingMeeting = intervals[0][1];
        int roomsNeeded=1;
        for(int i=1;i < intervals.length;i++){
            if(endingMeeting > intervals[i][0] ){
                roomsNeeded++;
            }

            endingMeeting=intervals[i][1];
        }

        System.out.println(roomsNeeded);
    }
}
