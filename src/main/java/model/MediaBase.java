package model;

public abstract class MediaBase {
    protected int id;
    protected String title;
    protected int duration;

    public MediaBase(int id, String title, int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public abstract String getType();
    public abstract void play();

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

}
