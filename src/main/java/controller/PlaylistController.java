package controller;

import service.PlaylistService;

public class PlaylistController {

    private PlaylistService service = new PlaylistService();

    public void createPlaylist(String name) {
        service.createPlaylist(name);
        System.out.println("Playlist created: " + name);
    }
}
