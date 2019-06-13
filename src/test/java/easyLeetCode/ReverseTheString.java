package easyLeetCode;

public class ReverseTheString {
    //recursively reverse a string.

    public static void main(String[] args) {
        System.out.println(getReversedString("Zelenskiy"));
        char[] vol = {'V', 'o', 'l'};
        System.out.println(getRecursivelyEncapsulated("Volodymyr"));
        System.out.println(getRecursive3("Ivanitskiy"));
    }

    public static String getReversedString(String input) {
        // String to Array
        char data[] = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            data[i] = input.charAt(i);
        }
        for (int i = 0; i < data.length / 2; i++) {
            char temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            stringBuilder.append(data[i]);
        }
        return stringBuilder.toString();
    }

    private static char[] getRecursively(char[] arr, int counter) {
    counter++;
    char temp = arr[counter];
    arr[counter] = arr[arr.length - 1 - counter];
    arr[arr.length - 1 - counter] = temp;
        if (counter < arr.length / 2) {
        getRecursively(arr, counter);
    }
        return arr;
}

    private static String getRecursivelyEncapsulated(String string) {
        char data[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            data[i] = string.charAt(i);
        }
        getRecursively(data, -1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            stringBuilder.append(data[i]);
        }
        return stringBuilder.toString();
    }


    public static String getRecursive3(String input) {
        char array[] = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            array[input.length()-1 - i] = input.charAt(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        String output = stringBuilder.append(array).toString();
        return output;
    }

}