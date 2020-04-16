package sample;

public class DD {

    public static void main(String[] args) {
        int [] v = {5, 8, 1};
        done(v);
        for (int i : v){
            System.out.println(i);
        }
        System.out.println();

    }

    public static void done(int [] t){
        int temp = t[0];
        t[0]=t[1];
        t[2]=temp;
    }
}
