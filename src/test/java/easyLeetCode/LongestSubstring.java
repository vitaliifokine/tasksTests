package easyLeetCode;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }


    public static int lengthOfLongestSubstring(String s) {
        int tail = 0;
        int head = 0;
        int max = 0;
        HashSet <Character> hashSet = new HashSet();

        while (head < s.length()){
            if (!hashSet.contains(s.charAt(head))){
                hashSet.add(s.charAt(head));
                head++;
                max = Math.max(hashSet.size(), max);
            }
            else {
                System.out.println("Before " + hashSet.size());
                hashSet.remove(s.charAt(tail));
                System.out.println("After " + hashSet.size());
                tail ++;
            }
        }
        return max;
    }
}
