package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinary67Test {

    @Test
    public void addBinary() {
        AddBinary67 addBinary67 = new AddBinary67();
        System.out.println(addBinary67.addBinary("11", "1"));
        System.out.println(addBinary67.addBinary("11", "11"));
    }
}