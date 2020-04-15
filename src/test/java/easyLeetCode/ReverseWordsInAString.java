package easyLeetCode;

public class ReverseWordsInAString {

//    Input: "the sky is blue"
//    Output: "blue is sky the"

    public static void main(String[] args) {
        String input = " the sky is    blue ";
        System.out.println(reverseWords(input));

    }

    public static String reverseWords(String input){
        StringBuilder stringBuilder = new StringBuilder();
        String [] temp = input.split(" ");
        for (int i=temp.length-1; i>=0; i--){
            if(!temp[i].isEmpty()){
                stringBuilder.append(temp[i] + " ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
