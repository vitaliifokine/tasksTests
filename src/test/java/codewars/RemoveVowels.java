package codewars;

public class RemoveVowels {

    public static void main(String[] args) {
        System.out.println(disemvowel("dOing"));
    }

    public static String disemvowel(String str) {
        return str.replace("o", "")
                .replace("a", "").replace("i", "")
                .replace("e", "")
                .replace("u", "")
                .replace("U", "")
                .replace("O", "")
                .replace("I", "")
                .replace("A", "")
                .replace("E", "");
    }
}
