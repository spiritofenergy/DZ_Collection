package org.example;

import java.util.*;


public class CollectionE {
    public static void main(String[] args) {

            ArrayList<Integer> intArrayList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                int element = scanner.nextInt();
                intArrayList.add(element);
                intArrayList.sort(Comparator.comparingInt(a->a));
                // Collections.sort(intArrayList);
                System.out.println(intArrayList);
            }
        }
}