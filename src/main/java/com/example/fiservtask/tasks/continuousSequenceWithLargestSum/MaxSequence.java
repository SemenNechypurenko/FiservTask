package com.example.fiservtask.tasks.continuousSequenceWithLargestSum;

public class MaxSequence {
    public Integer maxSubArraySum(Integer[] arrayOfInt) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        for (int i = 0; i < arrayOfInt.length; i++) {
            maxEndingHere = maxEndingHere + arrayOfInt[i];
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        if (arrayOfInt.length == 0) {
            System.out.println("no elements in the array");
            return 0;
        }
        return maxSoFar;
    }
}
