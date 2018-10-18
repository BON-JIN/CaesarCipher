package util;

public class Frequency
{
    private char c;
    private double frequency;

    
    public Frequency(char c, double freq)
    {
        this.c = c;
        frequency = freq;
    }
    
    public void display()
    {
    	System.out.println(c + ": " + frequency + "\n");
    }

    public double getFreq()
    {
        return frequency;
    }


}