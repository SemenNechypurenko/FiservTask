package com.example.fiservtask.informationFromWikipedia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WikiServiceTest {

    @Test
    void getNumberOfTimesTest() {
        WikiService wikiService = new WikiService();
        System.out.println("The result of word calculation is: " +
                wikiService.getNumberOfTimes("Pizza",
                        "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=")
        );
        assertEquals(149, wikiService.getNumberOfTimes("Pizza",
                "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="));
        assertNotEquals(42, wikiService.getNumberOfTimes("Pizza",
                "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="));
        assertEquals(0, wikiService.getNumberOfTimes("Pizza",
                "https://en.wikipedia.org/w/api.php?json&pagegggg42="));
    }

}