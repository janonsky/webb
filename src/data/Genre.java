package data;

public class Genre {
    private int id;
    private String name;
    private String description;
    public Genre() {
    }

    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }
    protected Genre(String name,String description,int id){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    protected void setId(){}
}
