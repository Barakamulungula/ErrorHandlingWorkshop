package com.company;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.optionalsTest();

    }

    private void optionalsTest (){

        Integer value1 = null;
        Integer value2 = 10;

        Optional<Integer> a =  Optional.ofNullable(value1);

        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a, b));
    }

    private int sum (Optional<Integer> a, Optional<Integer> b){
        System.out.println("First parameter is present: "+ a.isPresent());
        System.out.println("Second parameter is present: "+ b.isPresent());

        Integer value1 = a.orElse(0);
        //System.out.println(value1);

        Integer value2 = b.get();
        return value1 + value2;
    }
}
