package dao;

public class sqlPerRequestDAOFactory extends DAOFactory {

    @Override
    public AuthorsDAO getAuthorsDAO() {
        return new AuthorsDAOImpl();
    }

    @Override
    public GenreDAO geGenresDAO() {
        return new GenreDAOImpl();
    }

    @Override
    public BooksDAO getBooksDAO() {
        return new BookDAOImpl();
    }

    @Override
    public ReadersDAO getReadersDAO() {
        return new ReaderDAOImpl();
    }
}
