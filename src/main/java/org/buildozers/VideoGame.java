package org.buildozers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@ToString
public class VideoGame {

    @Getter
    private final UUID id;

    @Getter @Setter
    private String name;

    @Getter
    private final LocalDateTime lastEditionDate;

    public VideoGame(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.lastEditionDate = LocalDateTime.now();
    }

}
