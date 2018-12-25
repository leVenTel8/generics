package com.company;

public class Main {

    public static void main(String[] args) {
	    CustomArrayList<String> strings = new CustomArrayList<>();

        for(int i=0; i<100; i++){
            strings.add("Hello world "+ i);
        }

        for(int i = 0; i<strings.getLength(); i++){
            System.out.println(strings.get(i));
        }

        function(42);
        function("Hello world");


        CustomArrayList<Integer> list = new CustomArrayList<>();
    }

    static <T> void function(T parametr){
        System.out.println(parametr.toString());
    }
}
