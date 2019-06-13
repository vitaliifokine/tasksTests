package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set {
    public static void main(String[] args) {
        System.out.println(toSet(Arrays.asList("v", "d", "d")));

        for (int i=66; i<78; i++){
            System.out.println( (char)i);
        }
    }

    public static List toSet(List<Object> input){
        ArrayList<Object> data = new ArrayList<>();
        for (int i=0; i<input.size();i++){
            if (!data.contains(input.get(i))){
                data.add(input.get(i));
            }
        }
        return data;
    }

}
