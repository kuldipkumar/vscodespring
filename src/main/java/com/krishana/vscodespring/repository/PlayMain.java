package com.krishana.vscodespring.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class PlayMain {

    public static void main(String[] args) {
        List<String> empList = new ArrayList<>();

        empList.add("Ram");empList.add("Sham");empList.add("Jadu");empList.add("Madhu");


        for(int i=0; i<empList.size();i++){
            System.out.println(empList.get(i));
        }

        List<String> updatedList = empList.stream().map(s -> s.toLowerCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(updatedList);

        List<String> updatedList2 = empList.stream().filter(s -> !s.startsWith("M")).collect(Collectors.toList());
        System.out.println(updatedList2);

    }
}
