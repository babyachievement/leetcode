package com.babyachievement;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MeetingRoomII253Test {

    @Test
    public void minMeetingRooms() {
        MeetingRoomII253 roomII253 = new MeetingRoomII253();
        assertThat(roomII253.minMeetingRooms(Arrays.asList(
                new MeetingRooms252.Interval(0, 30),
                new MeetingRooms252.Interval(5, 10),
                new MeetingRooms252.Interval(15, 20))), is(2));
    }
}