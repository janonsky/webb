package data;

import java.util.Set;

public class Book {
    private int id;
    private String name;
    private String description;
    private Set<Genre> genres;
    private Set<Author> authors;

    public Book(String name, String description, Set<Genre> genres, Set<Author> authors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genres = genres;
        this.authors = authors;
    }
    public Book(){}
    public Book(String name,String description){
        this.name = name;
        this.description = description;
    }
    protected Book(int id, String name, String description, Set<Genre> genres, Set<Author> authors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genres = genres;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setId() {}

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

    public Set<Genre> getGenres() {
        return genres;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void addGenre(Genre genre) {
        this.genres.add(genre);
    }

    public void removeGenre(Genre genre){
        this.genres.remove(genre);
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void removeAuthor(Author author){
        this.authors.remove(author);
    }
}
