package edu.wsh.thirdyear.lab8.zad6;

import edu.wsh.thirdyear.lab8.zad2.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            String updateSQL = "UPDATE Student SET Age = ? WHERE Name = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
                pstmt.setInt(1, 27);
                pstmt.setString(2, "Vladyslav");
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Zaktualizowano rekord w tabeli Student.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
