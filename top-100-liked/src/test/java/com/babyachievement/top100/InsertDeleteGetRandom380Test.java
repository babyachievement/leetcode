package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertDeleteGetRandom380Test {

    @Test
    public void insert() {
        InsertDeleteGetRandom380 insertDeleteGetRandom380 = new InsertDeleteGetRandom380();
        insertDeleteGetRandom380.insert(0);
        insertDeleteGetRandom380.insert(1);
        insertDeleteGetRandom380.remove(0);
        insertDeleteGetRandom380.insert(2);
        insertDeleteGetRandom380.remove(1);
        System.out.println(insertDeleteGetRandom380.getRandom());

    }
}