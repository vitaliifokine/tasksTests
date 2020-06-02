package easyLeetCode;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStrings {

    public static void main(String[] args) {         // line 2
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);

        //       Function<Integer, Integer> function = a -> a + 2;

        list = list.stream().map(a -> a + 2).collect(Collectors.toList());

        System.out.println(list);


    }
}