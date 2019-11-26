package dao;

import data.Author;
import data.Book;

import java.util.Collection;
import static DataBase.DataBaseConnect.createDataSource;

public class BookDAOImpl implements BooksDAO {
    @Override
    public int insert(Book book) {
        return 0;
    }

    @Override
    public boolean delete(Book book) {
        return false;
    }

    @Override
    public Book findByID(int id) {
        return null;
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Book book) {
        return false;
    }

    @Override
    public Collection<Book> findByName(String name) {
        return null;
    }

    @Override
    public Collection<Book> findByAuthors(Author author) {
        return null;
    }
}
