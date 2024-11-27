package net.javagiudes.banking;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class BankingAppApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
        // This test verifies that the application context loads successfully
    }

    @Test
    void testDatabaseConnection() {
        assertThat(dataSource).isNotNull();
        
        try (Connection connection = dataSource.getConnection()) {
            assertThat(connection).isNotNull();
            System.out.println("Successfully connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
            assertThat(false).isTrue(); // Force fail the test
        }
    }
}
