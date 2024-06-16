package edu.wsh.thirdyear.lab8.zad7;

import edu.wsh.thirdyear.lab8.zad2.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            String deleteSQL = "DELETE FROM Student WHERE Name = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
                pstmt.setString(1, "Vladyslav");
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Usunięto rekord z tabeli Student.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

