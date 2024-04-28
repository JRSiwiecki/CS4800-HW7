package org.flyweight;

import static org.junit.jupiter.api.Assertions.*;

class CharacterFlyweightTest
{

    @org.junit.jupiter.api.Test
    void testEquals()
    {
        CharacterFlyweight a = CharacterFlyweight
                .CharacterFlyweightFactory
                .getCharacterFlyweight("Arial", "Red", "12");

        CharacterFlyweight b = CharacterFlyweight
                .CharacterFlyweightFactory
                .getCharacterFlyweight("Arial", "Red", "12");

        assertEquals(a, b);
    }

    @org.junit.jupiter.api.Test
    void testNotEquals()
    {
        CharacterFlyweight a = CharacterFlyweight
                .CharacterFlyweightFactory
                .getCharacterFlyweight("Arial", "Red", "12");

        CharacterFlyweight b = CharacterFlyweight
                .CharacterFlyweightFactory
                .getCharacterFlyweight("Calibri", "Blue", "14");

        assertNotEquals(a, b);
    }
}