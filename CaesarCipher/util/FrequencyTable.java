package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import util.*;
import java.util.Collections;
import table.TableInterface;
import table.TableFactory;


public class FrequencyTable
{

	private static FrequencyTable freq_table = new FrequencyTable();
	private ArrayList<Frequency> freqArray;
	private List<Candidate> candidates;

    public static FrequencyTable getFrequencyTable()
    {
    	return freq_table;
    }

	public Iterator<Frequency> iterator()
	{
		return freqArray.iterator();
	}

	public void caliculate(ArrayList<Character> a, ArrayList<Character> original)
	{
		

		for(int i = 0; i < 26; i++)
		{
			double CF = 0;
			
			for(Character ch : a)
			{
				CF = CF + ch.getFrequency()*getFrequency( ( (25 + ch.getOriginal()) - i ) % 26);
				/*System.out.println ("25 + " + c.getOriginal() + " - " + i + " % 26:" + " = " 
					+ ( (25 + c.getOriginal()) - i ) % 26 + "\n");*/
			}
			Candidate c = new Candidate(i + 65, CF);
			//c.display();
     		candidates.add(c);
     		
		}

		Collections.sort(candidates);
		//Collections.sort(candidates, ccc);
		//Collections.sort(candidates);

		ArrayList<Candidate> topFive = new ArrayList<Candidate>();
		
		for(int i = 0; i < 5; i++)
		{
			Candidate cc = candidates.get(i);
			topFive.add(cc);
			cc.display();
		}
		
		int count = 0;

		for(Candidate c : topFive)
		{
			String y = "The Decoded codes: ";  
			for(Character b : original)
			{
				int v =  ( (25 + b.getOriginal() - c.getOriginal() )  % 26) + 65;
				char x = (char) v;
				y = y + x;  
			}
			System.out.println(y);
			System.out.println("\n");
			//count++;
		}
	}				

	public double getFrequency(int position)
	{
		Frequency c = freqArray.get(position);
		return c.getFreq();
	}

    private FrequencyTable()
    {
		freqArray = new ArrayList<Frequency>();
		candidates = new ArrayList<Candidate>();
		//ccc = new CandidateComparator(true);

		Frequency a = new Frequency('A', .0817);
    	freqArray.add(a);

  		Frequency b = new Frequency('B', .0149);
    	freqArray.add(b);

    	Frequency c = new Frequency('C', .0278);
    	freqArray.add(c);

    	Frequency d = new Frequency('D', .0425);
    	freqArray.add(d);

		Frequency e = new Frequency('E', .1270);
    	freqArray.add(e);

    	Frequency f = new Frequency('F', .0223);
    	freqArray.add(f);

		Frequency g = new Frequency('G', .0202);
    	freqArray.add(g);

    	Frequency h = new Frequency('H', .0609);
    	freqArray.add(h);

    	Frequency i = new Frequency('I', .0697);
    	freqArray.add(i);

    	Frequency j = new Frequency('J', .0015);
    	freqArray.add(j);

		Frequency k = new Frequency('K', .0077);
    	freqArray.add(k);

		Frequency l = new Frequency('L', .0402);
    	freqArray.add(l);

    	Frequency m = new Frequency('M', .0241);
    	freqArray.add(m);

    	Frequency n = new Frequency('N', .0675);
    	freqArray.add(n);

    	Frequency o = new Frequency('O', .0751);
    	freqArray.add(o);

    	Frequency p = new Frequency('P', .0193);
    	freqArray.add(p);

    	Frequency q = new Frequency('Q', .0009);
    	freqArray.add(q);

    	Frequency r = new Frequency('R', .0599);
    	freqArray.add(r);

    	Frequency s = new Frequency('S', .0633);
    	freqArray.add(s);

    	Frequency t = new Frequency('T', .0906);
    	freqArray.add(t);

    	Frequency u = new Frequency('U', .0276);
    	freqArray.add(u);

		Frequency v = new Frequency('V', .0098);
    	freqArray.add(v);

    	Frequency w = new Frequency('W', .0236);
    	freqArray.add(w);

    	Frequency x = new Frequency('X', .0015);
    	freqArray.add(x);

    	Frequency y = new Frequency('Y', .0197);
    	freqArray.add(y);

    	Frequency z = new Frequency('Z', .0007);
    	freqArray.add(z);
    }


}