package org.xielei.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xielei
 */
@Slf4j
public class JdbcProvider {

    private static Connection connection = null;

    private static PreparedStatement preparedStatement = null;

    private static final String URL = "jdbc:mysql://47.114.178.106:3306/test?characterEncoding=UTF-8";

    public static PreparedStatement getPreparedStatement(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "123456");
            log.info("connection success");
            preparedStatement = connection.prepareStatement(sql);
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc Driver class not found \n" + e);
            log.info("jdbc Driver class not found", e);
        } catch (SQLException e) {
            System.out.println("mysql connection exception \n" + e);
        }
        return preparedStatement;
    }

    public static void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("close sql connection exception \n" + e);
            }
        }

        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("close preparedStatement exception \n" + e);
            }
        }

    }

}
