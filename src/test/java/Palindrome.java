public class Palindrome {

    public static void main(String [ ] args) {
        System.out.println(isPalindrom("radar"));
    }
    
    static boolean isPalindrom(String str) {
        if (str.length() == 0 || str.length() == 1){
            return true;
        } else {
            if (str.charAt(0) != str.charAt(str.length() - 1)){
                return false;
            } else {
                return isPalindrom(str.substring(1, str.length()-1));
            }
        }
    }
}
