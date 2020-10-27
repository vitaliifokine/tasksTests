package datastructures;

import java.util.Map;

public class HashMap<C, I extends Number> {

    public static void main(String[] args) {
        Map<Object,Object> test =new java.util.HashMap<>();
              test.put("King", 100);
              test.put("d", "Voldemar");
              test.put("C", "ee");
        System.out.println(test);
        int t = test.get("King").hashCode();
        int i = hash(test.get("King").hashCode());
        int v = 2306996 & 15;
        System.out.println(v);
    }

    static int hash(int h) {
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
}
