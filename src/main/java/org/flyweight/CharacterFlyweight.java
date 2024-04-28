package org.flyweight;

import java.util.ArrayList;

public class CharacterFlyweight
{
    private final String font;
    private final String size;
    private final String color;

    private CharacterFlyweight(String font, String size, String color)
    {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public String getFont()
    {
        return font;
    }

    public String getSize()
    {
        return size;
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public boolean equals(Object obj)
    {
        CharacterFlyweight other = (CharacterFlyweight) obj;
        return (this.font.equals(other.font)
                && this.size.equals(other.size)
                && this.color.equals(other.color));
    }

    public static class CharacterFlyweightFactory
    {
        private static final ArrayList<CharacterFlyweight> cache = new ArrayList<>();

        // Look for existing flyweight, if none exist, make it and add it to cache.
        public static CharacterFlyweight getCharacterFlyweight(String font, String size, String color)
        {
            CharacterFlyweight characterFlyweight = new CharacterFlyweight(font, size, color);

            if (!cache.contains(characterFlyweight))
            {
                cache.add(characterFlyweight);
            }

            int existingFlyweightIndex = cache.lastIndexOf(characterFlyweight);
            return cache.get(existingFlyweightIndex);
        }
    }
}
