package sortingItOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SortingChar {

    private char[] list =new char[26];

    public String printSorted()
    {
        String s="";
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<list[i];j++)
            {
                int num=i+97;
                char c= (char)num;
                s=s+c;
            }
        }
        return s;

    }

    public void loadWords() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/ruchin/Downloads/codekata/src/sortingItOut/Sentence.txt"));

        while(reader.ready()) {
            String word = reader.readLine().toLowerCase();
            for(Character c: word.toCharArray())
            {
                if(Character.isAlphabetic(c))
                {
                    list[c-97]++;
                }
            }

        }
    }

}
