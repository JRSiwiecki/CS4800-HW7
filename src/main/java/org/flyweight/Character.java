package org.flyweight;

public class Character
{
    private final char letter;
    private final CharacterFlyweight characterFlyweight;

    public Character(char letter, String font, String size, String color)
    {
        this.letter = letter;
        characterFlyweight = CharacterFlyweight.
                CharacterFlyweightFactory.getCharacterFlyweight(font, size, color);
    }

    public char getLetter()
    {
        return letter;
    }
}
