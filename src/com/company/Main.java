package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<Integer>(List.of(0, 1, 2, 3));
        System.out.println("set1 before removeAll() operation : " + set1);
        System.out.println("set2 before removeAll() operation : " + set2);
        System.out.println("Symmetric difference of set1 and set2 :" + symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        set2.removeAll(set1);
        difference.addAll(set2);
        return difference;
    }
}
