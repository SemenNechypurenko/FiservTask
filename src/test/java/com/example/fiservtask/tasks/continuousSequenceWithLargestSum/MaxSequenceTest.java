package com.example.fiservtask.tasks.continuousSequenceWithLargestSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MaxSequenceTest {

    @Test
    void maxSubArraySumTest() {
        MaxSequence maxSequence = new MaxSequence();
        Integer[] intArray = {5, -7, 6, 3, -1, -8, 6, -1, -2, 7};
        System.out.println("Max sum of the sequences in array " + Arrays.toString(intArray) + " is: " +
                maxSequence.maxSubArraySum(intArray)
        );
        assertEquals(10, maxSequence.maxSubArraySum(intArray));
        intArray = new Integer[]{2, -8, 3, -2, 4, -10};
        System.out.println("Max sum of the sequences in array " + Arrays.toString(intArray) + " is: " +
                maxSequence.maxSubArraySum(intArray)
        );
        assertEquals(5, maxSequence.maxSubArraySum(intArray));
        assertNotEquals(42, maxSequence.maxSubArraySum(intArray));
    }

}