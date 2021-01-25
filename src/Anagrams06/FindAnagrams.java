package Anagrams06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class FindAnagrams {
    private static final long INT_MIN = -1;
    private Map<String, TreeSet<String>> map = new HashMap<String, TreeSet<String>>();

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        FindAnagrams finder = new FindAnagrams();
        finder.loadWords();
        int count = finder.find();
        long end = System.currentTimeMillis();
        int setCount = finder.largestSetCount();
        String word = finder.longestPanagram();

        System.out.println("Sets: " + count);
        System.out.println("LongestSet have "+setCount +" words");
        System.out.println("Longest word is "+ word +"with length "+word.length() );
        System.out.println("Time: " + (end - start));
    }

    public void loadWords() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/ruchin/Downloads/codekata/src/data/words.txt"));

        while(reader.ready()) {
            String word = reader.readLine().toLowerCase();
            String key = sortString(word);

            if(!map.containsKey(key)) map.put(key, new TreeSet<String>());

            map.get(key).add(word);
        }
    }
    public int largestSetCount(){

        int maxCount = -1;
        int totalCount=0;

        for(TreeSet<String> set : map.values()) {
            totalCount += set.size();
            if (set.size() > maxCount) maxCount = set.size();
        }
        System.out.println("totat="+totalCount);
        return maxCount;
    }


    public String longestPanagram(){
        String word="";
        for(TreeSet<String> set: map.values())
        {
            if(set.size()>0)
            {
                if(set.first().length()>word.length())
                    word=set.first();
            }
        }
        return word;

    }

    public int find() {
        int count = 0;

        for(TreeSet<String> set : map.values())
            if(set.size() > 1) count++;

        return count;
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
