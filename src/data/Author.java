package data;

import java.sql.Date;
import java.time.LocalDate;

public class Author {
    private int id;
    private String firstName;
    private String secondName;
    private Date birthDate;
    public Author(){}
    public Author(String firstName, String secondName,Date birthDate)
    {
        this.firstName=firstName;
        this.secondName=secondName;
        this.birthDate=birthDate;
    }

    public Author(int id, String firstName, String secondName, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }
    protected void setId(){}

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

   protected void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    protected void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
