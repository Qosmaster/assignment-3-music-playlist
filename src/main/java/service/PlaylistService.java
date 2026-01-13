package service;

import exception.DuplicateResourceException;
import exception.InvalidInputException;
import repository.PlaylistRepository;

public class PlaylistService {

    private PlaylistRepository repository = new PlaylistRepository();

    public void createPlaylist(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidInputException("Playlist name cannot be empty");
        }

        if (repository.existsByName(name)) {
            throw new DuplicateResourceException("Playlist already exists");
        }

        repository.create(name);
    }
}
