package com.babyachievement;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FactorCombinations254Test {

    @Test
    public void getFactors() {
        FactorCombinations254 combinations254 = new FactorCombinations254();
        List<List<Integer>> factors = combinations254.getFactors(32);
        System.out.println(factors);
    }
}