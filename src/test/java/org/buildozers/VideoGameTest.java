package org.buildozers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VideoGameTest {

    @Test
    @DisplayName("Get Name of Video Game and verify correct structure")
    void getName() {

        VideoGame vg = new VideoGame("xenon");
        assertNotNull(vg);
        assertEquals("xenon", vg.getName());
        assertNotNull(vg.getId());
        LocalDateTime now = LocalDateTime.now();
        assertTrue(vg.getLastEditionDate().isEqual(now) || vg.getLastEditionDate().isBefore(now));

    }



}