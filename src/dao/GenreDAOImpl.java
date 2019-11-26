package dao;

import data.Genre;

import java.util.Collection;

public class GenreDAOImpl implements GenreDAO {
    @Override
    public int insert(Genre genre) {
        return 0;
    }

    @Override
    public boolean delete(Genre genre) {
        return false;
    }

    @Override
    public Genre findByID(int id) {
        return null;
    }

    @Override
    public boolean update(Genre genre) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Genre genre) {
        return false;
    }

    @Override
    public Collection<Genre> findByName(String name) {
        return null;
    }
}
