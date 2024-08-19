package org.example.hash.level2;

import java.util.*;

public class phoneNumber_level2 {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        String[] input = {"12","123","1235","567","88"};
        Arrays.sort(input);

        System.out.println("input : " + Arrays.stream(input).toList());

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < input.length - 2; j++) {
                if (input[j + 1].indexOf(input[i]) == 0
                        && input[j+1].length() >= input[i].length()
                        && !input[j + 1].equals(input[i])) {
                    System.out.println("find!!!" + input[j + 1] + " / " + input[i]);
                    break;
                }
            }
        }
    }

    public static void test2() {
        String[] input = {"119", "97674223", "1195524421"};
        Arrays.sort(input);

        System.out.println("input : " + Arrays.stream(input).toList());
        for (int i = 0; i < input.length-1; i++) {
            if (input[i + 1].indexOf(input[i]) == 0) {
                System.out.println("find!!!" + input[i + 1] + " / " + input[i]);
            }
        }
    }
}
