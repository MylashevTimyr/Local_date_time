package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Event {
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "yyyy:MM:dd HH:mm:ss.SSS",
               locale = "ru")
    private LocalDateTime eventDate;
}
