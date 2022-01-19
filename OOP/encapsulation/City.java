package OOP.encapsulation;

public class City {
    private String name;
    private int population;
    private String state;
    private int establishmentYear;
    public String flag;

    //setter (we want to set the value)

    public void setName(String cityName) {
        this.name = cityName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    //getters

    public String getName() {
        return this.name;
    }

    public int getPopulation() {
        return this.population;
    }

    public String getState() {
        return this.state;
    }

    public int getEstablishmentYear() {
        return this.establishmentYear;
    }
}
