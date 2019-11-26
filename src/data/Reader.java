package data;

import java.util.Set;

public class Reader {
    private int id;
    private String firstName;
    private String secondName;
    private Set<Reading> readings;
    public Reader(){}

    public Reader(String firstName, String secondName, Set<Reading> readings) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.readings = readings;
    }
    protected Reader(String firstName, String secondName, Set<Reading> readings,int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.readings = readings;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setId() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Set<Reading> getReadings() {
        return readings;
    }

    public void addReading(Reading reading) {
        this.readings.add(reading);
    }

    public void removeReading(Reading reading){
        this.readings.remove(reading);
    }
    public void add(Reading reading)
    {
        this.readings.add(reading);
    }
}
