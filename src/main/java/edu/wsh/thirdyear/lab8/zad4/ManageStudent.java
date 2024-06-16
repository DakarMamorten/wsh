package edu.wsh.thirdyear.lab8.zad4;
import edu.wsh.thirdyear.lab8.zad2.DBConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManageStudent {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS Student (" +
                    "ID SERIAL PRIMARY KEY, " +
                    "Name VARCHAR(50), " +
                    "Age INT, " +
                    "Major VARCHAR(50))";
            statement.execute(createTableSQL);

            String insertDataSQL = "INSERT INTO Student (Name, Age, Major) VALUES" +
                    "('Denis Derihlazow', 20, 'Computer Science')," +
                    "('Yurii Chalov', 21, 'Computer Science')," +
                    "('Vladyslav Paun', 28, 'Computer Science')";
            statement.executeUpdate(insertDataSQL);

            String selectSQL = "SELECT * FROM Student";
            ResultSet rs = statement.executeQuery(selectSQL);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String major = rs.getString("Major");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Major: " + major);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
