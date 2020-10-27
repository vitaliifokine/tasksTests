package codewars;

public class CreditMasking {

    public static void main(String[] args) {
        System.out.println(maskify(""));
    }

    public static String maskify(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++){
            if (i < str.length()-4){
                result += "#";
            }

            else {
                result += str.charAt(i);
            }
        }
        return result;

    }

    public static String maskifyRegex(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }

}
