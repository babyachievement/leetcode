package com.babyachievement;

import java.util.*;

/**
 * https://www.lintcode.com/problem/meeting-rooms-ii/description
 */
public class MeetingRoomII253 {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<MeetingRooms252.Interval> intervals) {
        List<MeetingRooms252.Interval> start = new ArrayList();
        List<MeetingRooms252.Interval> end = new ArrayList();

        for(MeetingRooms252.Interval interval: intervals) {
            start.add(interval);
            end.add(interval);
        }


        Collections.sort(start, new Comparator<MeetingRooms252.Interval>() {
            @Override
            public int compare(MeetingRooms252.Interval o1, MeetingRooms252.Interval o2) {
                return o1.start - o2.start;
            }
        });

        Collections.sort(end, new Comparator<MeetingRooms252.Interval>() {
            @Override
            public int compare(MeetingRooms252.Interval o1, MeetingRooms252.Interval o2) {
                return o1.end - o2.end;
            }
        });

        int count = 0, max = 0;

        int i=0, j=0;

        while(i<intervals.size()){
            if(start.get(i).start <= end.get(j).end){
                count++;
                i++;
            }else {
                j++;
                count--;
            }

            max = Math.max(max, count);
        }


        return max;
    }
    public int minMeetingRooms2(List<MeetingRooms252.Interval> intervals) {

        Collections.sort(intervals, new Comparator<MeetingRooms252.Interval>() {
            @Override
            public int compare(MeetingRooms252.Interval o1, MeetingRooms252.Interval o2) {
                return o1.start - o2.start;
            }
        });
        // Write your code here

        int min = Integer.MAX_VALUE;
        int max = 0;
        for (MeetingRooms252.Interval interval : intervals) {
            if (interval.start < min) {
                min = interval.start;
            }

            if (interval.end > max) {
                max = interval.end;
            }
        }


        int maxCount = 0;
        for (int i = min; i <= max; i++) {
            int count = 0;
            for (MeetingRooms252.Interval interval : intervals) {
                if (i >= interval.start && i <= interval.end) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }


}
