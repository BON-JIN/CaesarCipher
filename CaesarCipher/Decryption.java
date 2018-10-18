//package util;

import util.*;
import java.util.*;
import util.Frequency;
import util.Character;
import util.FrequencyTable;
import java.util.Iterator; 



public class Decryption
{
    public static void main (String [] arg)
	{

         FrequencyTable a = util.FrequencyTable.getFrequencyTable();

        // READ text files
        util.ReadTextFile rf = new util.ReadTextFile("ciphertext.txt");
		String cipher_text = rf.readLine();
		System.out.println("\n" + "CipherText: " + "\n" + cipher_text +"\n");


        String result = "";
        cipher_text = cipher_text.toUpperCase();

        System.out.println("LENGTH with duplicate and spaces: " +  cipher_text.length() + "\n");

        ArrayList<Character> frequency = new ArrayList<Character>();
        ArrayList<Character> as = new ArrayList<Character>();

        //Use it to caliculate frequency
        double lentgthWOspace = cipher_text.length();

        for(int i = 0; i < cipher_text.length(); i++)
        {
            char c = cipher_text.charAt(i);
            if(c == ' ')
            {
                lentgthWOspace--;
            }         
        }
        
        System.out.println("LENGTH with no duplicate and no space: " + lentgthWOspace + "\n");

        //Calculate actual frequencies for each
        for(int i = 0; i < cipher_text.length(); i++)
        {
            int count = 0;
            char c = cipher_text.charAt(i);
            
            //Ignore space for now
            if(c == ' ')
            {
                continue;
            }

            for(int j = 0; j < cipher_text.length(); j++)
            {
                char s = cipher_text.charAt(j);
                if (c == s)
                count ++;
            }

            double freq = count / lentgthWOspace;

            Character cha = new Character(c, freq);
            Character wduplicate = new Character(c, freq);

            boolean duplicate = false;
            as.add(wduplicate);

            if(frequency.isEmpty())
            {
              frequency.add(cha);  
            }
        
            else
            {
                for(Character ch : frequency)
                {
                    if(ch.isDuplicated(cha))
                    {
                        duplicate = true;
                        break;
                    }    
                }
                if(!duplicate){
                    frequency.add(cha);
                }
                
            }
        }
            
        a.caliculate(frequency, as);
        System.out.println("\n" + "Result " + "\n" + result + "\n");
	}
}


