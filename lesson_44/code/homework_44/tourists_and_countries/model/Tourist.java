package homework_44.tourists_and_countries.model;

import java.util.List;

public class Tourist {
    //fields
    private String name;
    private List<String> country;

    public Tourist(String name, List<String> country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Name: " + name + " , country: " + country.toString();
    }
}
