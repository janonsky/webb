package dao;

import data.Genre;

import java.util.Collection;

public interface GenreDAO {
    public int insert(Genre genre);
    public boolean delete(Genre genre);
    public Genre findByID(int id);
    public boolean update(Genre genre);
    public boolean saveOrUpdate(Genre genre);
    public Collection<Genre> findByName(String name);
}
