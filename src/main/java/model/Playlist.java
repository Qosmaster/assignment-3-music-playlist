package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int id;
    private String name;
    private List<MediaBase> mediaList = new ArrayList<>();

    public Playlist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addMedia(MediaBase media) {
        mediaList.add(media);
    }

    public List<MediaBase> getMediaList() {
        return mediaList;
    }

    public String getName() {
        return name;
    }
}
