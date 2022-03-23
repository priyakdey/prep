package com.priyakdey.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KadaneAlgorithmTest {

    @Test
    void maxSubarraySum1() {
        int n = 5;
        int arr[] = {1, 2, 3, -2, 5};
        assertEquals(9, new KadaneAlgorithm().maxSubarraySum(arr, n));
    }

    @Test
    void maxSubarraySum2() {
        int n = 4;
        int arr[] = {-1, -2, -3, -4};
        assertEquals(9, new KadaneAlgorithm().maxSubarraySum(arr, n));
    }
}