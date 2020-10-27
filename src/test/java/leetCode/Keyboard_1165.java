package leetCode;

import java.util.HashMap;

public class Keyboard_1165 {

    public static void main(String[] args) {
        System.out.println(calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
    }

    public static int calculateTime(String keyboard, String word) {
        int counter = 0;
        int currentPosition = 0;
        int changed = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<keyboard.length(); i++){
            map.put(keyboard.charAt(i), i);
        }

        for (int i =0; i<word.length(); i++){
            changed = map.get(word.charAt(i));
            if (changed > currentPosition){
                counter += changed - currentPosition;
                currentPosition = changed;
            }
            else if (changed < currentPosition){
                counter += currentPosition - changed;
                currentPosition = changed;
            }
        }
        return counter;
    }


}
