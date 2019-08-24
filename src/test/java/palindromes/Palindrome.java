package palindromes;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrom("pop"));
    }


    // Elegant show of recursion in the end. The substring make
    // a input string less and less till moment of ending of recursion
    static boolean isPalindrom(String str) {
        str = str.toLowerCase();
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else {
            return isPalindrom(str.substring(1, str.length() - 1));
        }
    }
}
