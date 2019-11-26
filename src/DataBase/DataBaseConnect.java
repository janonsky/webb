package DataBase;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataBaseConnect {
    private static final String HOST = "localhost";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    private static final String DB_NAME = "javabd";

    public static MysqlDataSource createDataSource() {
        MysqlDataSource source = new MysqlDataSource();
        source.setServerName(HOST);
        source.setUser(USER);
        source.setPassword(PASSWORD);
        source.setDatabaseName(DB_NAME);
        return source;
    }
}
