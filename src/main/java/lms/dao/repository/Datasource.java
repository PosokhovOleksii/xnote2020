package lms.dao.repository;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Datasource implements AutoCloseable {

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL="jdbc:mysql://localhost/xnote2020?user=root&password=1111";

        private Connection connection = null;

        public Datasource() {
            try{
                Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
            } catch (IllegalAccessException | InstantiationException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection()
        {
            try {
                if( connection == null ) {
                    connection = DriverManager.getConnection(DB_URL);
                }
            }
            catch( SQLException e ) {
                System.out.println("Error Occured " + e.toString());
            }
            return connection;
        }

        @Override
        public void close() throws Exception {
            try {
                if( connection != null ) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

