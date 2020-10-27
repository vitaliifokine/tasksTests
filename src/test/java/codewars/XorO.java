package codewars;

public class XorO {
    public static void main(String[] args) {
        System.out.println(getXO("xxxXooOo"));
    }

    public static boolean getXO (String str) {
        int x = 0;
        int o = 0;
        str = str.toLowerCase();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'x'){
                x += 1;
            }
            if (str.charAt(i) == 'o'){
                o += 1;
            }
        }
       // if (x == o){return true;}

        return x == o;

    }
}
