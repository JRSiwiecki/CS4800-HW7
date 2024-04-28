package org.flyweight;

import java.util.ArrayList;

public class Document
{
    private final ArrayList<Character> characters = new ArrayList<>();

    public void addCharacter(Character character)
    {
        characters.add(character);
    }

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();

        for (Character character : characters)
        {
            result.append(character.toString()).append("\n");
        }

        return result.toString();
    }
}
