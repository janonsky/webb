package dao;

import data.Reader;

import java.awt.print.Book;
import java.util.Collection;

public class ReaderDAOImpl implements ReadersDAO {
    @Override
    public int insert(Reader reader) {
        return 0;
    }

    @Override
    public boolean delete(Reader reader) {
        return false;
    }

    @Override
    public Reader findByID(int id) {
        return null;
    }

    @Override
    public boolean update(Reader reader) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Reader reader) {
        return false;
    }

    @Override
    public Collection<Reader> findByName(String firstName, String secondName) {
        return null;
    }

    @Override
    public Collection<Reader> findReadersWithBooks(Book book) {
        return null;
    }
}
