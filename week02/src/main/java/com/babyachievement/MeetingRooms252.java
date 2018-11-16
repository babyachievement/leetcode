/**
 * date: 2018/11/16 9:50
 */

package com.babyachievement;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.lintcode.com/problem/meeting-rooms/description
 */
public class MeetingRooms252 {
    class Interval
    {
        int start, end;
        Interval( int start, int end){
        this.start = start;
        this.end = end;
    }
    }

    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < intervals.get(i - 1).end) {
                return false;
            }
        }

        return true;
    }
}
