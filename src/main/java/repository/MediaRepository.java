package repository;

import model.MediaBase;
import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MediaRepository {

    public void create(MediaBase media) {
        String sql = "INSERT INTO media(title, duration, type) VALUES (?,?,?)";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, media.getTitle());
            ps.setInt(2, media.getDuration());
            ps.setString(3, media.getType());
            ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Failed to create media");
        }
    }

    public List<String> getAllTitles() {
        List<String> list = new ArrayList<>();
        String sql = "SELECT title FROM media";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(rs.getString("title"));
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch media");
        }
        return list;
    }
}
