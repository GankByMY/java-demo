package org.xielei.jdbc;

import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author xielei
 */
@Service
public class JdbcTest {

    public int addName(String name) {
        String sql = "insert into jdbc_test (name) values (?)";
        int rows = executeUpdate(sql, name);

        if (rows < 0) {
            System.out.println("insert data error");
            return 0;
        }

        return rows;
    }

    public int deleteByName(String name) {
        String sql = "delete from jdbc_test where name = (?)";
        int rows = executeUpdate(sql, name);

        if (rows < 0) {
            System.out.println("delete data error");
            return 0;
        }

        return rows;
    }

    public int modify(String name) {
        String sql = "update jdbc_test set name = (?) where name = (?)";
        int rows = executeUpdate(sql, name, name);

        if (rows < 0) {
            System.out.println("modify data error");
            return 0;
        }

        return rows;
    }

    private int executeUpdate(String sql, String ...args) {
        int rows = 0;

        try {
            PreparedStatement preparedStatement = JdbcProvider.getPreparedStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setString(i + 1, args[i]);
            }
            rows = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("preparedStatement setString exception \n" + e);
        } finally {
            JdbcProvider.close();
        }
        return rows;
    }

}
