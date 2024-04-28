package org.proxy;

import java.util.ArrayList;
import java.util.List;

public class SongServer implements SongService
{
    private final ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song)
    {
        if (!songs.contains(song))
        {
            songs.add(song);
        }
    }

    @Override
    public Song searchById(Integer songID)
    {
        addArtificialDelay();

        return songs.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title)
    {
        addArtificialDelay();

        ArrayList<Song> matchingSongs = new ArrayList<>();

        for (Song song : songs)
        {
            if (song.getTitle().equals(title))
            {
                matchingSongs.add(song);
            }
        }

        return matchingSongs;
    }

    @Override
    public List<Song> searchByAlbum(String album)
    {
        addArtificialDelay();

        ArrayList<Song> matchingSongs = new ArrayList<>();

        for (Song song : songs)
        {
            if (song.getAlbum().equals(album))
            {
                matchingSongs.add(song);
            }
        }

        return matchingSongs;
    }

    public void addArtificialDelay()
    {
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) { }
    }
}
