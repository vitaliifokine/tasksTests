package codewars;

public class Mumbling {


    public static String accum(String s) {
        String result = "";

        for (int i=0; i<s.length(); i++){
            int d = 0;
            if (i>0) {result += "-";}
            while (d<i+1){
                if (d==0){
                    result += s.toUpperCase().charAt(i);
                    d++;
                } else {
                    result += s.toLowerCase().charAt(i);
                    d++;
                }
            }


        }

        return result;
    }
}
