package homework_35.test;

import homework_35.dao.Calendar;
import homework_35.dao.CalendarImpl;
import homework_35.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CalendarImplTest {
    Calendar calendar;
    Event[] events;
    LocalDateTime now = LocalDateTime.now();

    Comparator<Event> comparator = (e1, e2) -> {
        return Integer.compare(e1.getId(), e2.getId());
    };

    @BeforeEach
    void setUp() {
        calendar = new CalendarImpl(5);
        events = new Event[4];
        events[0] = new Event(1, "event1", "wedding", now.minusDays(2));
        events[1] = new Event(2, "event2", "birthday", now.minusDays(1));
        events[2] = new Event(3, "event3", "funeral", now.minusDays(3));
        events[3] = new Event(4, "event4", "party", now.minusDays(4));

        for (int i = 0; i < events.length; i++) {
            calendar.addEvent(events[i]);
        }
        for (Event e : events) {
            System.out.println(e);
        }
    }

    @Test
    void addEvent() {
        assertFalse(calendar.addEvent(null));
        assertFalse(calendar.addEvent(events[0]));
        Event event = new Event(5, "event5", "party", now.minusDays(10));
        assertTrue(calendar.addEvent(event));
        assertEquals(5, calendar.size());
        event = new Event(6, "event6", "wedding", now.minusDays(20));
        assertFalse(calendar.addEvent(event));
    }

    @Test
    void removeEvent() {
        assertTrue(calendar.removeEvent(events[0]));
        assertEquals(3, calendar.size());

    }

    @Test
    void size() {
        assertEquals(4, calendar.size());
    }
}