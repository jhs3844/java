package org.example.hash;

import java.util.HashSet;
import java.util.Set;

public class pokemon_level1 {
    public static void main(String[] args) {

        Set<Integer> result = new HashSet<>();
        int[] nums = {3, 1, 2, 3};
        int shot = nums.length / 2;
//        result.add(nums[0]);

        for (
                int i = 0;
                i < nums.length; i++) {
            result.add(nums[i]);
        }
        if (result.size() >= shot) {
            System.out.println("resulut : " + shot);
        } else if (result.size() < shot) {
            System.out.println("resulut : " + result.size());
        }
    }
}
