package strings;

import java.util.Arrays;

public class StringFirstLetterToUpperCase {

    static String convert(String str) {
        char [] data = new char[str.length()];
        for (int i=0; i<str.length(); i++){
            data[i] = str.charAt(i);
            if (String.valueOf(data[i])==" "){
                data[i+1] = Character.toUpperCase(data[i+1]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i<data.length;i++){
            stringBuilder.append(data[i]);
        }

        return stringBuilder.toString();

    }

    public static void main(String[] args)
    {
        String str = "volodya goes to theater";
        System.out.println(convert(str));
    }
}
