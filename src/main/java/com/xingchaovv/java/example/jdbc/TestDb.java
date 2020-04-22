package com.xingchaovv.java.example.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.Properties;

public class TestDb {

    public static void main(String[] args) throws IOException, SQLException, URISyntaxException {
        URL url = TestDb.class.getClassLoader().getResource("database.properties");
        InputStream inputStream = Files.newInputStream(Path.of(url.toURI()));
        Properties properties = new Properties();
        properties.load(inputStream);

        Connection connection = DriverManager.getConnection(
            properties.getProperty("jdbc.url"), properties.getProperty("jdbc.username"), properties.getProperty("jdbc.password")
        );

        Statement statement = connection.createStatement();
        int updateRowNum = statement.executeUpdate("insert into `config` (`name`, `content`) values ('chaochao1', 'data1')");
        System.out.println(updateRowNum);

        ResultSet resultSet = statement.executeQuery("select * from `config`");
        while (resultSet.next()) {
            System.out.printf("%s, %s\n", resultSet.getString("name"), resultSet.getString("content"));
        }
    }
}
