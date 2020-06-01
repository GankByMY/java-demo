package org.xielei.jdbc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JdbcTestTest {

    private JdbcTest jdbcTest;

    @Before
    public void setUp() throws Exception {
        jdbcTest = new JdbcTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addName() {
        System.out.println(jdbcTest.addName("maple"));
    }

    @Test
    public void deleteByName() {
        System.out.println(jdbcTest.deleteByName("tom"));
    }

    @Test
    public void modify() {
        System.out.println(jdbcTest.modify("maple"));
    }
}