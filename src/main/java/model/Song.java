package model;

public class Song extends MediaBase {

    public Song(int id, String title, int duration) {
        super(id, title, duration);
    }

    @Override
    public String getType() {
        return "SONG";
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + title);
    }
}
