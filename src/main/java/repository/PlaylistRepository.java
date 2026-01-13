package repository;

import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlaylistRepository {

    public void create(String name) {
        String sql = "INSERT INTO playlist(name) VALUES (?)";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Failed to create playlist");
        }
    }

    public boolean existsByName(String name) {
        String sql = "SELECT id FROM playlist WHERE name = ?";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            throw new RuntimeException("Failed to check playlist");
        }
    }
}
