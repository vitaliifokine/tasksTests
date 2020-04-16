package easyLeetCode;

public class ReverseString2 {

    public static void main(String[] args) {
        String input = "Dylan Bob";
        System.out.println(getReversedWords(input));
    }

    public static String getReversedWords(String string){
        StringBuilder stringBuilder = new StringBuilder();
        String [] v = string.split(" ");
        for (int i=v.length-1; i>=0; i--){
            if (!v[i].isEmpty()) {
                stringBuilder.append(v[i] + " ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
