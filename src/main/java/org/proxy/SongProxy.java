package org.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongProxy implements SongService
{
    private final SongService songServer;
    private final Map<String, List<Song>> cachedTitles = new HashMap<>();
    private final Map<String, List<Song>> cachedAlbums = new HashMap<>();

    public SongProxy(SongService songServer)
    {
        this.songServer = songServer;
    }

    @Override
    public Song searchById(Integer songID)
    {
        return songServer.searchById(songID);
    }

    @Override
    public List<Song> searchByTitle(String title)
    {
        if (cachedTitles.containsKey(title))
        {
            return cachedTitles.get(title);
        }

        else
        {
            List<Song> matchingSongs = songServer.searchByTitle(title);
            cachedTitles.put(title, matchingSongs);
            return matchingSongs;
        }
    }

    @Override
    public List<Song> searchByAlbum(String album)
    {
        if (cachedAlbums.containsKey(album))
        {
            return cachedAlbums.get(album);
        }

        else
        {
            List<Song> matchingSongs = songServer.searchByAlbum(album);
            cachedAlbums.put(album, matchingSongs);
            return matchingSongs;
        }
    }
}
