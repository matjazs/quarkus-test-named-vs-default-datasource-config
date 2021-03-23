package org.acme.getting.started;

import io.agroal.api.AgroalDataSource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;

@QuarkusTest
public class DataSourceTest {
    @Inject
    AgroalDataSource dataSource;

    @Test
    public void testGetConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        Assertions.assertNotNull(connection);
    }
}