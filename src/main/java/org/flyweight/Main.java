package org.flyweight;

public class Main
{
    public static void main(String[] args)
    {
        Character a1 = new Character('H', "Arial", "Red", "12");
        Character a2 = new Character('e', "Calibri", "Blue", "14");
        Character a3 = new Character('l', "Verdana", "Black", "16");
        Character a4 = new Character('l', "Lato", "Orange", "18");
        Character a5 = new Character('o', "Arial", "Red", "12");
        Character a6 = new Character('W', "Calibri", "Blue", "14");
        Character a7 = new Character('o', "Verdana", "Black", "16");
        Character a8 = new Character('r', "Lato", "Orange", "18");
        Character a9 = new Character('l', "Arial", "Red", "12");
        Character a10 = new Character('d', "Calibri", "Blue", "14");
        Character a11 = new Character('C', "Verdana", "Black", "16");
        Character a12 = new Character('S', "Lato", "Orange", "18");
        Character a13 = new Character('5', "Arial", "Red", "12");
        Character a14 = new Character('8', "Calibri", "Blue", "14");
        Character a15 = new Character('0', "Verdana", "Black", "16");
        Character a16 = new Character('0', "Lato", "Orange", "18");

        Document doc = new Document();

        doc.addCharacter(a1);
        doc.addCharacter(a2);
        doc.addCharacter(a3);
        doc.addCharacter(a4);
        doc.addCharacter(a5);
        doc.addCharacter(a6);
        doc.addCharacter(a7);
        doc.addCharacter(a8);
        doc.addCharacter(a9);
        doc.addCharacter(a10);
        doc.addCharacter(a11);
        doc.addCharacter(a12);
        doc.addCharacter(a13);
        doc.addCharacter(a14);
        doc.addCharacter(a15);
        doc.addCharacter(a16);

        System.out.println(doc);
    }
}
