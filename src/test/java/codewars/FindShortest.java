package codewars;

public class FindShortest {

    public static void main(String[] args) {
        System.out.println(findShort("Sample texting"));
    }


    public static int findShort(String s) {
        String [] arr = s.split(" ");
        int result = 0;
        for(int i=0; i<arr.length; i++){
            if (result == 0){
                result = arr[i].length();
            }
            if (result>arr[i].length()){
                result = arr[i].length();
            }

        }
        return result;
    }
}
