package transitivedependencies18;

import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Transitivity {


    public static ConcurrentHashMap<Character,HashSet<Character>> mp = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        Transitivity.add_element('A','B');
        Transitivity.add_element('A','C');
        Transitivity.add_element('B','E');
        Transitivity.add_element('B','C');
        Transitivity.add_element('C','G');
        Transitivity.add_element('D','A');
        Transitivity.add_element('D','F');
        Transitivity.add_element('E','F');
        Transitivity.add_element('F','H');

        System.out.println(mp);

        HashSet<Character> set = new HashSet<>();
        HashMap<Character,HashSet<Character>> mp1 =new HashMap<>(mp);

        for(Character c: mp.keySet())
        {
            set = mp1.get(c);
            HashSet<Character> set1 = new HashSet<>(set);
            for(Character a: set)
            {
                if(mp.get(a)!=null) {
                HashSet<Character> st = mp.get(a);
                set1.addAll(st);
                System.out.println(c + ":" + set1);
                // mp1.put(c,set);
            }
            }

        }
        System.out.println(mp1);


    }

    public static void add_element(Character s,Character c)
    {   HashSet<Character> temp ;
        if(mp.get(s)==null)
        {
            temp= new HashSet<>();
        }
        else
        {
            temp = mp.get(s);
        }

        temp.add(c);
        mp.put(s,temp);

    }
}
