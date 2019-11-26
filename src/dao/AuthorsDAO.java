package dao;

import data.Author;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public interface AuthorsDAO {
    public int insert(Author author);
    public boolean delete(Author author);
    public Author findByID(int id);
    public boolean update(Author author);
    public boolean saveOrUpdate(Author author);
    public Collection<Author> findByName(String firstName,String secondName);
    ArrayList<Author> getAll();
    ArrayList<Author> getByParameters(Map<String, String[]> map);
}
