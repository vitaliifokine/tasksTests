package codewars;

public class Inhabitants {
    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int counter = 0;
        int result = p0;
        percent = percent / 100;
        while (result < p){
           result = (int) (result + result * percent + aug);
           counter +=1;
        }

        return counter;
    }
}
