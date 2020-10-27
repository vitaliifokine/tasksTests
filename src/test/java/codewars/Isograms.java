package codewars;

import java.util.HashSet;
import java.util.Set;

public class Isograms {

    public static void main(String[] args) {
        System.out.println(isIsogram("Demo"));
    }

    public static boolean  isIsogram(String str) {
        Set<Character> set = new HashSet<>();
        str  = str.toLowerCase();
        for (int i=0; i<str.length(); i++){
            if (set.contains(str.charAt(i))){
                return false;
            }
            set.add(str.charAt(i));
        }
        return true;
    }
}
