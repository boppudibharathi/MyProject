package com.test.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("A");
//        List<String> ls= list.stream().limit(3).collect(Collectors.toList());
//        ls.forEach(i-> System.out.println(i));

       List<String> ls1= list.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
       ls1.forEach(i-> System.out.println(i));



    }
}
