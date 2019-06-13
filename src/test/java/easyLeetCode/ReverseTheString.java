package easyLeetCode;

public class ReverseTheString {
    //recursively reverse a string.

    public static void main(String[] args) {
        System.out.println(getReversedString("Zelenskiy"));
    }

    public static String getReversedString(String input){
        // String to Array
        char data[] = new char[input.length()];
        for (int i=0; i<input.length(); i++){
            data[i]=input.charAt(i);
        }

        for (int i=0; i<data.length/2; i++){
            char temp = data[i];
            data[i]=data[data.length-1-i];
            data[data.length-1-i]=temp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            stringBuilder.append(data[i]);
        }

        return stringBuilder.toString();
    }
}


