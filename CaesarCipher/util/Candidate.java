package util;
import java.util.*;
import java.lang.Comparable;

public class Candidate implements Comparable<Candidate>
{
    private char c;
    private double cf;
    private int original_position;
    
    public Candidate(int asc, double cF)
    {
        this.c = (char) asc;
        cf = cF;
        original_position = ((int) c);
    }
    
    public void display()
    {
    	System.out.println(c + ": " + cf + "\n");
    }

    public double getCf()
    {
        return cf;
    }

    public int getOriginal()
    {
        return original_position - 65;
    }

    public int compareTo(Candidate c)
    {
        if( this.getCf() > c.getCf() ){
            return -1;
        }
        else if( this.getCf() < c.getCf() ){
            return 1;
        }
        else
            return 0;
    }
}
