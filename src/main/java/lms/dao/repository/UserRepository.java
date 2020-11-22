package lms.dao.repository;

import lms.dao.entity.User;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class UserRepository {
    public User getUserByEmailByPassword(String email, String password){
        Datasource dataSource = new Datasource();
        String query = "SELECT name, owner, sex, birth FROM pet WHERE email =" + email + "'" +
                " AND password='" + password + "'";
        return null;

    }

}

