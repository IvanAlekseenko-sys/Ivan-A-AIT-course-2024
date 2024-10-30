package homework_35.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event implements Comparable<Event> {

//fields

    private int id;
    private String title;
    private String description;
    private LocalDateTime date;


    public Event(int id, String title, String description, LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;


    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Event o) {
        return Integer.compare(this.getId(),o.getId());
    }
}
