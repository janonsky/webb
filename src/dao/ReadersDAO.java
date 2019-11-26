package dao;

import data.Reader;

import java.awt.print.Book;
import java.util.Collection;

public interface ReadersDAO {
    public int insert(Reader reader);
    public boolean delete(Reader reader);
    public Reader findByID(int id);
    public boolean update(Reader reader);
    public boolean saveOrUpdate(Reader reader);
    public Collection<Reader> findByName(String firstName,String secondName);
    public Collection<Reader> findReadersWithBooks(Book book);
}
