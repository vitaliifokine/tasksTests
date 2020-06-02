package easyLeetCode;

import java.util.HashMap;

public class ToLowerCase {

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(toLowerCase(input));
        input.toLowerCase();
    }

    public static String toLowerCase(String str) {
        HashMap<Character, Character> map = new HashMap<>();
        String output= "";
        map.put('A', 'a');
        map.put('B', 'b');
        map.put('C', 'c');
        map.put('D', 'd');
        map.put('E', 'e');
        map.put('F', 'f');
        map.put('G', 'g');
        map.put('H', 'h');
        map.put('I', 'i');
        map.put('J', 'j');
        map.put('K', 'k');
        map.put('L', 'l');
        map.put('M', 'm');
        map.put('N', 'n');
        map.put('O', 'o');
        map.put('P', 'p');
        map.put('Q', 'q');
        map.put('R', 'r');
        map.put('S', 's');
        map.put('T', 't');
        map.put('U', 'u');
        map.put('V', 'v');
        map.put('W', 'w');
        map.put('X', 'x');
        map.put('Y', 'y');
        map.put('Z', 'z');
        for (int i =0; i<str.length(); i++){
            if (map.containsKey(str.charAt(i))){
                output+=map.get(str.charAt(i));
            }
            else output+=str.charAt(i);
        }
        return output;
    }

}
