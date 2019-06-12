package easyLeetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class JewelsAndStones {
//    You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//    The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//    Example 1:
//
//    Input: J = "aA", S = "aAAbbbb"
//    Output: 3
//    Example 2:
//
//    Input: J = "z", S = "ZZ"
//    Output: 0

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("a", "AAAADaaDd"));
        System.out.println(numJewelsInStones2("ad", "AAAAaDDd"));
    }

    //O(n2) - bad solution
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i = 0; i < J.length(); i++ )
        {
            for( int j = 0; j < S.length(); j++ )
            {
                if( J.charAt(i) == S.charAt(j) )
                    count++;
            }
        }
        return count;
    }

    //n - better complexity, but not ideal
    public static int numJewelsInStones2(String Jewel, String Stones) {
        Set<Character> set = new HashSet<>();

        for(Character ch : Jewel.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for(Character b: Stones.toCharArray()) {
            if(set.contains(b)) {
                count++;
            }
        }
        return count;
    }
}