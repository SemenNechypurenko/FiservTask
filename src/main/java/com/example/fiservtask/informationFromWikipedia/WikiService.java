package com.example.fiservtask.informationFromWikipedia;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.client.RestTemplate;

public class WikiService {
    private final RestTemplate template = new RestTemplate();
    public Integer getNumberOfTimes(String topic, String url) {
        try {
            var parse = template.getForEntity(url.concat(topic), String.class).getBody();
            ObjectNode node = new ObjectMapper().readValue(parse, ObjectNode.class);
            if (node != null && node.has("parse")
                    && node.get("parse").get("text") != null
                    && node.get("parse").get("text").get("*") != null) {
                var stringValue = node.get("parse").get("text").get("*").textValue();
                return stringValue.split(topic).length - 1;
            }
            return 0;
        } catch (JsonProcessingException e) {
            return 0;
        }
    }
}




