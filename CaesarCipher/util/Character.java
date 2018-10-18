package util;

//import .*;

public class Character
{
    private char c;
    private double frequency;
    private int original_position;

    public Character(char c, double f)
    {
        this.c = c;
        frequency = f;
        original_position = ((int) c) - 65;
    }

	public void display()
    {
    	System.out.println(c + ", " + original_position + "\n" + "Frequency: " + frequency + "\n");
    }

    public char get()
    {
    	return c;
    }

    public int getOriginal()
    {
        return original_position;
    }

    public double getFrequency()
    {
        return frequency;
    }


    public boolean isDuplicated(Character ch)
    {
    	return this.c == ch.get();
    }
} 