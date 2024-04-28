package org.proxy;

public class Song
{
    private final String title;
    private final String artist;
    private final String album;
    private final int duration;

    public Song(String title, String artist, String album, int duration)
    {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getAlbum()
    {
        return album;
    }

    public int getDuration()
    {
        return duration;
    }

    @Override
    public boolean equals(Object obj)
    {
        Song other = (Song) obj;

        return (this.title.equals(other.getTitle())
        && this.artist.equals(other.getArtist())
        && this.album.equals(other.getAlbum())
        && this.duration == other.getDuration());
    }
}
