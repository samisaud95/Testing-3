import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    ZonedDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();

    @Test
    void testFormatoDataOra() {
        String result =Main.formatoMedium(dateTime);
        assertEquals("1 mar 2023",result);

    }
}