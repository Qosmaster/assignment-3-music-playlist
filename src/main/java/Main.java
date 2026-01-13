import controller.PlaylistController;
import model.MediaBase;
import model.Podcast;
import model.Song;
import repository.MediaRepository;

public class Main {
    public static void main(String[] args) {

        MediaRepository mediaRepo = new MediaRepository();

        MediaBase song = new Song(0, "Song One", 200);
        MediaBase podcast = new Podcast(0, "Podcast One", 1200);

        mediaRepo.create(song);
        mediaRepo.create(podcast);

        song.play();
        podcast.play();

        PlaylistController controller = new PlaylistController();
        controller.createPlaylist("My Playlist2");

        System.out.println("All media in DB:");
        System.out.println(mediaRepo.getAllTitles());
    }
}
