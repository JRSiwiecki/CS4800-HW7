package org.flyweight;

public class Character
{
    private final char letter;
    private final CharacterFlyweight characterFlyweight;

    public Character(String font, String size, String color, char letter)
    {
        characterFlyweight = CharacterFlyweight.
                CharacterFlyweightFactory.getCharacterFlyweight(font, size, color);
        this.letter = letter;
    }

    public char getLetter()
    {
        return letter;
    }
}
