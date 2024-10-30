package homework_35.dao;

import homework_35.model.Event;

public interface Calendar {
    boolean addEvent(Event event);

    boolean removeEvent(Event event);

    int size();

}
