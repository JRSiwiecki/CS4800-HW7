package org.flyweight;

import java.util.ArrayList;

public class CharacterFlyweight
{
    private final String font;
    private final String color;
    private final String size;

    private CharacterFlyweight(String font, String color, String size)
    {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public String getFont()
    {
        return font;
    }

    public String getColor()
    {
        return color;
    }

    public String getSize()
    {
        return size;
    }

    @Override
    public boolean equals(Object obj)
    {
        CharacterFlyweight other = (CharacterFlyweight) obj;
        return (this.font.equals(other.font)
                && this.color.equals(other.color)
                && this.size.equals(other.size));
    }

    public static class CharacterFlyweightFactory
    {
        private static final ArrayList<CharacterFlyweight> cache = new ArrayList<>();

        // Look for existing flyweight, if none exist, make it and add it to cache.
        public static CharacterFlyweight getCharacterFlyweight(String font, String color, String size)
        {
            CharacterFlyweight characterFlyweight = new CharacterFlyweight(font, color, size);

            if (!cache.contains(characterFlyweight))
            {
                cache.add(characterFlyweight);
            }

            int existingFlyweightIndex = cache.lastIndexOf(characterFlyweight);
            return cache.get(existingFlyweightIndex);
        }
    }
}
