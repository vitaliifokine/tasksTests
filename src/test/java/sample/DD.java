package sample;

public class DD {

    public static void main(String[] args) {
        String [] arr = {"Flower", "Flow", ""};
        System.out.println(getCommonPrefix(arr));

    }

   public static String getCommonPrefix(String [] input){
        if (input.length == 0){return "";}
        String word = input[0];

        for (int i=1; i<input.length; i++){
            boolean flag = true;
            int counter = 0;
            int len = word.length() >= input[i].length() ? input.length : word.length();

            while (flag){
                if (input[i].isEmpty()){return "";}
                if (counter < len && word.charAt(counter)==input[i].charAt(counter)){
                    counter++;
                }
                else {
                    flag = false;
                    word = word.substring(0, counter);
                }

            }

        }

        return word;
   }
}
