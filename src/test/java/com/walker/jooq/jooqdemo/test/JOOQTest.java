package com.walker.jooq.jooqdemo.test;

import com.walker.jooq.jooqdemo.model.Tables;
import com.walker.jooq.jooqdemo.model.tables.AdminUser;
import com.walker.jooq.jooqdemo.model.tables.records.AdminUserRecord;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JOOQTest {

    private DSLContext dslContext;

    @Before
    public void before() throws SQLException {
        dslContext = getDslContext();
    }

    @Test
    public void testQuery() {
        dslContext.selectFrom(Tables.ADMIN_USER)
                .fetchInto(AdminUser.class)
                .stream()
                .forEach(adminUser -> System.err.println(adminUser));
    }

    private DSLContext getDslContext() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exchange?serverTimezone=UTC",
                "root", "root");
        return DSL.using(connection, SQLDialect.MYSQL_8_0);
    }
}
