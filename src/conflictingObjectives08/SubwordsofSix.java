package conflictingObjectives08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class SubwordsofSix {

    private Set<String> wordSet = new TreeSet<String>();

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        SubwordsofSix sub = new SubwordsofSix();
        sub.loadWords();
        int count = sub.countWordsOfLengthSix();

        long end = System.currentTimeMillis();

        System.out.println("Count:  " + count);
        System.out.println("Time: " + (end - start) + "ms");
    }

    public void loadWords() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/ruchin/Downloads/codekata/src/data/words.txt"));

        while(reader.ready()) {
            String word = reader.readLine().toLowerCase();

            if(word.length() <= 6) wordSet.add(word);
        }
    }

    public int countWordsOfLengthSix() {
        int count = 0;

        for(String word : wordSet) {
            if(word.length() == 6) {
                for(int i = 1; i < word.length(); i++) {
                    String sub1 = word.substring(0, i);
                    String sub2 = word.substring(i);

                    if(wordSet.contains(sub1) && wordSet.contains(sub2)) count++;
                }
            }
        }

        return count;
    }
}
