package easyLeetCode;

public class DefangingAnIPAddress {


    public static void main(String[] args) {
        String input = "255.255.255.0";
        String output = returnUpdated(input);
        System.out.println(output);
    }


    public static String returnUpdated(String input) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='.'){
                temp.append("[.]");
            }
            else temp.append(input.charAt(i));
        }
        return temp.toString();
    }
}
