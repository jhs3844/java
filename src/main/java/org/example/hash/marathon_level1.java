package org.example.hash;
import java.util.*;
public class marathon_level1 {
    public static void main(String[] args) {
        test3();
    }

    public static void test1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"leo", "kiki"};

        List<String> pt = new ArrayList<>();
        List<String> cp = new ArrayList<>();
        for (String name : participant) {
            pt.add(name);
        }
        for (String nm : completion) {
            cp.add(nm);
        }

        System.out.println("pt :" + pt);
        System.out.println("cp :" + cp);

        for (int i=0; i < cp.size(); i++) {
            if (pt.contains(cp.get(i))) {
                pt.remove(cp.get(i));
            }
        }

        System.out.println(pt.get(0));
    }

    public static void test2() {
        List<String> participant = new ArrayList<>(List.of("leo", "kiki", "eden"));
        List<String> completion = new ArrayList<>(List.of("eden", "kiki"));

        for (int i=0; i < completion.size(); i++) {
            System.out.println(completion.get(i));
            if (participant.contains(completion.get(i))) {
                participant.remove(completion.get(i));
            }
        }

        System.out.println("participant : " + participant.get(0));
    }

    public static void test3() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println("sorting participant : " + Arrays.stream(participant).toList());
        System.out.println("sorting completion : " + Arrays.stream(completion).toList());
        int i = 0;
        for (i=0; i<completion.length; i++) {

            if (!participant[i].equals(completion[i])) {
                System.out.println(participant[i]);
            }
        }
        System.out.println(participant[i]);
    }

}
