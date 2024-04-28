package org.proxy;

public class Main
{
    public static void main(String[] args)
    {
        SongServer songServer = new SongServer();
        SongService songProxy = new SongProxy(songServer);

        songServer.addSong(
                new Song("seisyun complex", "Kessoku Band",
                        "Kessoku Band", 203));

        songServer.addSong(
                new Song("hitoribocchi tokyo", "Kessoku Band",
                        "Kessoku Band", 233));

        songServer.addSong(
                new Song("Distortion!!", "Kessoku Band",
                        "Kessoku Band", 203));

        songServer.addSong(
                new Song("Secret base", "Kessoku Band",
                        "Kessoku Band", 233));

        songServer.addSong(
                new Song("Watashi Dake Yuurei", "SICK HACK",
                        "SICK HACK", 203));

        // New additions to proxy
        long startTime = System.currentTimeMillis();
        System.out.println(songProxy.searchById(0));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for searchById: " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println(songProxy.searchByTitle("hitoribocchi tokyo"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for searchByTitle: " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println(songProxy.searchByAlbum("Kessoku Band"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for searchByAlbum: " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println(songProxy.searchByTitle("Secret base"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for searchByTitle: " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println(songProxy.searchByAlbum("SICK HACK"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for searchByAlbum: " + (endTime - startTime) + " milliseconds");

        // Should exist in proxy
        startTime = System.currentTimeMillis();
        System.out.println(songProxy.searchByTitle("hitoribocchi tokyo"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for searchByTitle: " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println(songProxy.searchByAlbum("SICK HACK"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for searchByAlbum: " + (endTime - startTime) + " milliseconds");
    }
}
