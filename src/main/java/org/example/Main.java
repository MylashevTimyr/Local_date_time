package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        LocalDateTime now = LocalDateTime.now();
        Event event = new Event(now);
        String jsonString = mapper.writeValueAsString(event);
        System.out.println(jsonString);
    }
}
