package org.example.hash;
import java.util.*;
public class marathon_level1 {
    public static void main(String[] args) {
        List<String> participant = new ArrayList<>(List.of("leo", "kiki", "eden"));
        List<String> completion = new ArrayList<>(List.of("eden", "kiki"));

        for (int i=0; i < completion.size(); i++) {
            System.out.println(completion.get(i));
            if (participant.contains(completion.get(i))) {
                participant.remove(completion.get(i));
            }
        }

        System.out.println("participant : " + participant.getFirst());
    }
}
