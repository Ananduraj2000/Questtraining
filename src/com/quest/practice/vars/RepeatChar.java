package com.quest.practice.vars;

public class RepeatChar {
    public static void main(String[] args) {
        String s = "Ananduraj";


        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println();


        for (int i = 0; i < s.length(); i++) {
            char cCharacter = s.charAt(i);


            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == cCharacter) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }


            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == cCharacter) {
                    count++;
                }
            }


            System.out.println(cCharacter + " = " + count);
        }
    }
}


