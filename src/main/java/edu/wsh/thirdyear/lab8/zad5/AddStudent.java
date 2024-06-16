package edu.wsh.thirdyear.lab8.zad5;

import edu.wsh.thirdyear.lab8.zad2.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudent {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            String insertSQL = "INSERT INTO Student (Name, Age, Major) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setString(1, "Milian");
                pstmt.setInt(2, 26);
                pstmt.setString(3, "Geography");
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Dodano rekord do tabeli Student.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
