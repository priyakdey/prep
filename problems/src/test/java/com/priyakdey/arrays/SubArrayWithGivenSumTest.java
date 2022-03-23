package com.priyakdey.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SubArrayWithGivenSumTest {

    @Test
    public void testSubArraySum1() throws Exception {
        int n = 5, s = 12;
        int[] a = {1, 2, 3, 7, 5};

        Assertions.assertEquals(new ArrayList<>(List.of(2, 4)), SubArrayWithGivenSum.subArraySum(a, n, s));
    }

    @Test
    public void testSubArraySum2() throws Exception {
        int n = 10, s = 15;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Assertions.assertEquals(new ArrayList<>(List.of(1, 5)), SubArrayWithGivenSum.subArraySum(a, n, s));
    }

    @Test
    public void testSubArraySum3() throws Exception {
        int n = 42, s = 468;
        int[] a = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};

        Assertions.assertEquals(new ArrayList<>(List.of(38, 42)), SubArrayWithGivenSum.subArraySum(a, n, s));
    }

}