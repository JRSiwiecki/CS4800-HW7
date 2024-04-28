package org.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest
{

    @Test
    void testEquals()
    {
        Song a = new Song("World is Mine", "Hatsune Miku", "", 176);
        Song b = new Song("World is Mine", "Hatsune Miku", "", 176);

        assertEquals(a, b);
    }

    @Test
    void testNotEquals()
    {
        Song a = new Song("World is Mine", "Hatsune Miku", "", 176);
        Song b = new Song("Unknown Mother Goose", "Hatsune Miku", "", 339);

        assertNotEquals(a, b);
    }
}