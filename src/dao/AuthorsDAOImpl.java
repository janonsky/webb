package dao;

import DataBase.DataBaseConnect;
import data.Author;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static DataBase.DataBaseConnect.createDataSource;

public class AuthorsDAOImpl implements AuthorsDAO {
    @Override
    public int insert(Author author) {
        MysqlDataSource source=(MysqlDataSource) createDataSource();
        final String sql="insert into authors values (?,?,?,?)";
        try {
            Connection connection=source.getConnection();
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,author.getId());
            statement.setString(2,author.getFirstName());
            statement.setString(3,author.getSecondName());
            statement.setDate(4,author.getBirthDate());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean delete(Author author) {
        MysqlDataSource source=createDataSource();
        final String sql="DELETE  FROM authors WHERE idauthors=?";
        try {
            Connection connection=source.getConnection();
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,author.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Author findByID(int id) {
        final  MysqlDataSource source=createDataSource();
        final String sql="SELECT * FROM authors WHERE idauthors=?";
        try (Connection connection = source.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            final ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return new Author(resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(Author author) {
        MysqlDataSource source=createDataSource();
        final String sql="update javabd.authors set first_name=?,set second_name=?,set birth_date=? where idauthors=? ";
        try {
            Connection connection=source.getConnection();
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,author.getId());
            statement.setString(2,author.getFirstName());
            statement.setString(3,author.getSecondName());
            statement.setDate(4,author.getBirthDate());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    public void print(){
        ArrayList<Author> authors=getAll();
        for(Author el:authors)
            System.out.println(el.getFirstName());
    }

    @Override
    public boolean saveOrUpdate(Author author) {
        return false;
    }

    @Override
    public Collection<Author> findByName(String firstName, String secondName) {
        MysqlDataSource source=createDataSource();
        final String sql="SELECT * FROM  javabd.authors where first_name=? and second_name=?";
       ArrayList<Author> authors=new ArrayList<>();
        try {
            Connection connection=source.getConnection();
            PreparedStatement statement=connection.prepareStatement(sql);
            final ResultSet resultSet =statement.executeQuery();
            while (resultSet.next())
            {
                authors.add(new Author(resultSet.getString(2),resultSet.getString(3),resultSet.getDate(4)));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authors;
    }

    @Override
    public ArrayList<Author> getAll() {
        MysqlDataSource source= createDataSource();
        final String sql = "SELECT * FROM authors";
        ArrayList<Author> authors = new ArrayList<>();

        try {
            Connection connection=source.getConnection();
            PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                int id=resultSet.getInt("idauthors");
                String fName=resultSet.getString("first_name");
                String sName=resultSet.getString("second_name");
                Date date=resultSet.getDate("birth_date");
               // System.out.println(fName+" "+sName+" "+date);
                authors.add(new Author(id,fName,sName, (java.sql.Date) date));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authors;
    }

    @Override
    public ArrayList<Author> getByParameters(Map<String, String[]> parameters) {
        MysqlDataSource source=createDataSource();
        final StringBuilder sql = new StringBuilder("SELECT * FROM authors WHERE ");

        ArrayList<Author> items = new ArrayList<>();

        boolean isMultipleConditions = false;
        for (Map.Entry<String, String[]> parameter : parameters.entrySet()) {
            if (!isMultipleConditions) {
                isMultipleConditions = true;
            } else sql.append(" AND ");

            sql.append(parameter.getKey())
                    .append("='")
                    .append(String.join(" ", parameter.getValue()))
                    .append("'");
        }

        try (Connection connection = source.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql.toString())) {

            final ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                items.add(new Author(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }
}
