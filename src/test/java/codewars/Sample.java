package codewars;

public class Sample {

    public static void main(String[] args) {
        int [] arr = {1, 2};
        System.out.println(bmi(170, 5.8));
        double v = 60 / 1;
        System.out.println(v);
    }

    public static double find_average(int[] array){
        double count = 0;

        for(int i=0; i<array.length; i++){
            count += array[i];
        }
        double avg  = count / array.length;
        return avg;

    }

    public static String bonusTime(final int salary, final boolean bonus) {
        int val = bonus ? salary * 10 : salary;
        return "\\u00A3" + Integer.toString(val);
    }

    public static int[] reverse(int n){
        int[] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[arr.length-1-i] = i+1;
        }
        return arr;
    }

    public static String rps(String p1, String p2) {
        String scissors = "scissors";
        String paper = "paper";
        String rock = "rock";
        String result = "";

        if (p1.equalsIgnoreCase(p2)) {
            result = "Draw!";
        }
        if (p1.equals(scissors) && p2.equals(paper)) {
            result = "Player 1 won!";
        }
        if (p1.equals(paper) && p2.equals(scissors)) {
            result = "Player 2 won!";
        }
        if (p1.equals(rock) && p2.equals(scissors)) {
            result = "Player 1 won!";
        }
        if (p1.equals(scissors) && p2.equals(rock)) {
            result = "Player 2 won!";
        }
        if (p1.equals(paper) && p2.equals(rock)) {
            result = "Player 1 won!";
        }
        if (p1.equals(rock) && p2.equals(paper)) {
            result = "Player 2 won!";
        }
        return result;
    }

    public static int oddCount(int n){
        int count = 0;

        for(int i=0; i<n; i++){
            if(i % 2 != 0){ count += 1;};
        }
        System.out.println(n / 2);
        return count;
    }


    public static String bmi(double weight, double height) {
        double index = weight / height;
        String result = "";
        if(index <= 18.5){ result= "Underweight";};
        if(index <= 25.0){ result = "Normal";};
        if(index <= 30.0){ result = "Overweight";};
        if(index <= 30.0){ result = "Obese";};
        result.toCharArray();
        return result;
    }

    public static String convert(boolean b){
        return b ? "true" : "false";
    }

}
