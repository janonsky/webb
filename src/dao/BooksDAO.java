package dao;

import data.Author;
import data.Book;

import java.util.Collection;

public interface BooksDAO {
    public int insert(Book book);
    public boolean delete(Book book);
    public Book findByID(int id);
    public boolean update(Book book);
    public boolean saveOrUpdate(Book book);
    public Collection<Book> findByName(String name);
    public Collection<Book> findByAuthors(Author author);
}
