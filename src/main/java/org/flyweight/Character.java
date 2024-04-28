package org.flyweight;

public class Character
{
    private final char letter;
    private final CharacterFlyweight characterFlyweight;

    public Character(char letter, String font, String color, String size)
    {
        this.letter = letter;
        characterFlyweight = CharacterFlyweight.
                CharacterFlyweightFactory.getCharacterFlyweight(font, color, size);
    }

    public char getLetter()
    {
        return letter;
    }

    @Override
    public String toString()
    {
        return letter + " [" + characterFlyweight.getFont()
                + ", " + characterFlyweight.getColor()
                + ", " + characterFlyweight.getSize() + "]";
    }
}
