package dao;

public abstract class DAOFactory {
    protected DAOFactory() {
    }
    public static DAOFactory getDaoFactory() {
        return new sqlPerRequestDAOFactory();
    }

    public abstract AuthorsDAO getAuthorsDAO();

    public abstract GenreDAO geGenresDAO();

    public abstract BooksDAO  getBooksDAO();

    public abstract ReadersDAO  getReadersDAO();
}
