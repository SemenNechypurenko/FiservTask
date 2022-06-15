package com.example.fiservtask;

import com.example.fiservtask.informationFromWikipedia.WikiService;
import com.example.fiservtask.tasks.continuousSequenceWithLargestSum.MaxSequence;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FiservTaskApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(FiservTaskApplication.class, args);
        // first task about array sequence
        MaxSequence maxSequence = new MaxSequence();
        // Input: (5, -7, 6, 3, -1, -8, 6, -1, -2, 7) -You may use any arguments
        Integer[] intArray = {5, -7, 6, 3, -1, -8, 6, -1, -2, 7};
        System.out.println("Max sum of the sequences in array is: " +
                maxSequence.maxSubArraySum(intArray)
        );
        // second task about getting data from Wiki
        WikiService wikiService = new WikiService();
        System.out.println("The number of world in Your request to Wiki is: " +
                        wikiService.getNumberOfTimes("Pizza",
                                "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=")
                );
    }



}
