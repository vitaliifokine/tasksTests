package codewars;

public class Middle {

    public static void main(String[] args) {
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("a"));
    }


    public static String getMiddle(String word) {
        String result = "";
        if (word.length()==1){
            result = word;
        }
        else if (word.length() % 2 != 0 && word.length()>1){
            result = word.substring(word.length() / 2, word.length() / 2 +1);
        }
        else if (word.length() % 2 == 0 && word.length()>1){
            result = word.substring(word.length() / 2 -1, word.length() / 2+1);
            System.out.println(result);
        }
        return result;


    }
}
