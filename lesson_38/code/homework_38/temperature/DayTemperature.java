package homework_38.temperature;

//Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября. Создайте класс DayTemperature c полями:
//LocalDate date;
//double temperature; Сформируйте два ArrayList и внесите в них данные измерений температуры. Рассчитайте среднюю температуру в городе за прошедшие две недели. В какой день была минимальная температура? В какой день максимальная?

import java.time.LocalDate;
import java.util.Objects;

public class DayTemperature {
    //fields

    private LocalDate localDate;
    double temperature;

    public DayTemperature(LocalDate localDate, double temperature) {
        this.localDate = localDate;
        this.temperature = temperature;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DayTemperature that)) return false;
        return Double.compare(temperature, that.temperature) == 0 && Objects.equals(localDate, that.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localDate, temperature);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DayTemperature{");
        sb.append("localDate=").append(localDate);
        sb.append(", temperature=").append(temperature);
        sb.append('}');
        return sb.toString();
    }
}
