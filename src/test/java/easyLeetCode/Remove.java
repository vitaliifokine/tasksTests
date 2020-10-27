package easyLeetCode;

public class Remove {

    public static void main(String[] args) {
        System.out.println(remove("Dodod"));
        System.out.println(removewithRegex("Dodod"));
    }

    public static String remove(String str) {
        return str.substring(1, str.length()-1);
    }

    public static String removewithRegex(String str) {

        return str.replaceAll("^.|.$", "");

    }


}
