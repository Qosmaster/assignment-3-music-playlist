package model;

public class Podcast extends MediaBase {

    public Podcast(int id, String title, int duration) {
        super(id, title, duration);
    }

    @Override
    public String getType() {
        return "PODCAST";
    }

    @Override
    public void play() {
        System.out.println("Playing podcast: " + title);
    }
}
