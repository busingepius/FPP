package lecturer11;

import java.util.HashSet;
import java.util.Set;

// Demo code for Hashset class
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //HashSet<String> set2 = new HashSet();
        set.add("Java");
        set.add("Swing");
        set.add("Java Spring");
        set.add("Banana");
        System.out.println(set);
        System.out.println("Removed Java from the set " + set.remove("Java"));
        System.out.println("Set contains Swing : " + set.contains("Swing"));
        System.out.println("Size of the set : " + set.size());

        HashSet<String> objSet = new HashSet<>();

        for (String s : set) {
            System.out.println(s);
        }
        objSet.add("Java");

        if (objSet.add("Java"))
            System.out.println(true);
        else
            System.out.println(false);

        /////////////////////////////////////////////////////////////////////////////////
	/*	HashSet<String> stateSet = new HashSet<String>();
		stateSet.add ("CA");
		stateSet.add ("WI");
		stateSet.add ("NY");
		stateSet.add (null);

		if (stateSet.contains("PB")) // if CA, it will not add but shows following message
		     System.out.println("Already found");
		else
		    stateSet.add("PB");
		 System.out.println(stateSet);

		 HashSet<Integer> numberSet = new HashSet<Integer>();
		 numberSet.add(10);
		 numberSet.add(-12);
		 numberSet.add(15);
		 numberSet.add(16);
		 numberSet.remove(15);
		 boolean s = numberSet.add(19);
		 for(Integer num:numberSet)
	            System.out.println("Value : " + num);
		 System.out.println(s);*/

    }

}
