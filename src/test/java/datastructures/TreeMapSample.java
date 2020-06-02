package datastructures;

import java.util.TreeMap;

public class TreeMapSample {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Sample");
        map.put(2, "Volodka");
        map.put(1, "DDO");
        map.put(5, "KKS");
        map.put(4, "val");

        System.out.println(map);
    }
}
