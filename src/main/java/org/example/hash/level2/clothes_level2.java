package org.example.hash.level2;

import java.util.*;
import java.util.stream.Collectors;

public class clothes_level2 {

    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        String[][] input = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}, {"black_pants", "pants"}, {"brown_coat", "coat"}};

//        String[][] input = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        HashMap<String, Set<String>> map = new HashMap<>();

        for (int i=0; i<input.length; i++) {
            Set<String> set = new HashSet<>();

            if (map.get(input[i][1]) != null) {
                set.addAll(map.get(input[i][1]));
                set.add(input[i][0]);
                map.put(input[i][1], set);
            } else {
                set.add(input[i][0]);
                map.put(input[i][1], set);
            }
        }
        System.out.println("res map : " + map);

        int index = 1;
        for (String type : map.keySet()) {
            System.out.println("type : " + type);
            index = index * (map.get(type).size() + 1);
            System.out.println(index);
        }
        System.out.println("result : " + (index-1));

    }

    static void test2() {
        String[][] input = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}, {"black_pants", "pants"}, {"brown_coat", "coat"}};

        System.out.println(input[0].length);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<input.length;i++) {
            String key = input[i][1];

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int index = 1;
        for (String cloth : map.keySet()) {
             index = index * (map.get(cloth) + 1);
        }

        System.out.println(index-1);
    }
}
