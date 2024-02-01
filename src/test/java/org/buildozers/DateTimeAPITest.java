package org.buildozers;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeAPITest {
    @Test
    void testDateTimeAPI() {
        Date d = new Date();
        System.out.printf("Date : %s%n", d);
        ZonedDateTime zdt = ZonedDateTime.ofInstant(d.toInstant(), ZoneId.of("UTC"));
        System.out.printf("ZDT  : %s%n", zdt);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss");
        System.out.printf("ZDT formatted : %s%n", zdt.format(formatter));
    }
}
