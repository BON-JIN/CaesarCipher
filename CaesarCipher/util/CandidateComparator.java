package util;
import java.util.Comparator;
import util.*;

class CandidateComparator implements Comparator<Candidate>
{
    private boolean asc;

    public CandidateComparator(boolean asc)
    {
        this.asc = asc;
    }

    public int compare(Candidate a, Candidate b)
    {
        if (asc)
        {
            return (int) ( a.getCf() - b.getCf() );
        }    
        else
        {
            return (int) ( a.getCf() - b.getCf() );
        }
    }
}