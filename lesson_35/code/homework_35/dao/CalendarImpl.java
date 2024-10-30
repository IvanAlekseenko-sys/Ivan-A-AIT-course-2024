package homework_35.dao;

import homework_35.model.Event;

import java.util.Arrays;
import java.util.Comparator;

public class CalendarImpl implements Calendar {
    private Event[] events;
    private int size;

    public CalendarImpl(int capacity) {
        this.events = new Event[capacity];
        // this.size = size; // Вы можете установить size в 0 по умолчанию
    }

    Comparator<Event> comparator = (e1, e2) -> Integer.compare(e1.getId(), e2.getId());

    @Override
    public boolean addEvent(Event event) {
        if (event == null || size == events.length) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (events[i].getId() == event.getId()) {
                return false; // Событие с таким id уже существует
            }
        }

        // find index where we should insert
        int index = Arrays.binarySearch(events, 0, size, event, comparator);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(events, index, events, index + 1, size - index);
        events[index] = event;
        size++;
        return true;
    }

    @Override
    public boolean removeEvent(Event event) {
        for (int i = 0; i < size; i++) {
            if (events[i].getId() == event.getId()) {
                System.arraycopy(events, i + 1, events, i, size - i - 1);
                events[size - 1] = null; // Установите последний элемент в null
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
