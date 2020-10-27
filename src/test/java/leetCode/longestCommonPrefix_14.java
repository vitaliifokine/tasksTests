package leetCode;

public class longestCommonPrefix_14 {

    public static void main(String[] args) {
        String [] arr = {"Flower", "Flow", "Flight", "DD"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        // Follow the logic
        // 1) Take first word
        // 2) Take a second word and compare each letter

        if (strs.length == 0){return "";}
        String word = strs[0];

        for (int i = 1; i<strs.length; i++){
            // variables for while loop through letters
            String comparisonWord = strs[i];
            int counter = 0;
            int len = word.length() >=  comparisonWord.length() ? comparisonWord.length() : word.length();
            boolean flag = true;
            while (flag){
                if (counter < len && word.charAt(counter) == comparisonWord.charAt(counter)){
                    counter++;
                }
                else {
                    word = word.substring(0, counter);
                    flag = false;
                    break;
                }
            }

        }
        return word;
    }


}
