package edu.wsh.thirdyear.lab8.zad3;
import edu.wsh.thirdyear.lab8.zad2.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDBConnection {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Połączenie z bazą danych zostało nawiązane.");
            } else {
                System.out.println("Nie udało się nawiązać połączenia z bazą danych.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
