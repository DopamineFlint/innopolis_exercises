package ru.baryshnikov.task24;

public class Palindrome {

    public static boolean checkForPal(String str) {
        String s = str;
        StringBuilder sbb = new StringBuilder(str);
        sbb.reverse();

        System.out.println(s);
        System.out.println(sbb);

        if (s.equals(sbb.toString())) {
            return true;
        }
        return false;
    }

    public static boolean StringForPal(String str) {
        boolean check = true;
        char[] arr = str.toCharArray();
        if (arr.length % 2 == 0) {
            int i = 0;
            int slength = arr.length - 1;
            while (i < arr.length/2) {
                char f = arr[i];
                char s = arr[slength];

                System.out.println(f);
                System.out.println(s);

                if (f != s) {
                    check = false;
                }

                i++;
                slength--;
            }
        }

        if (arr.length % 2 == 1) {
            int i = 0;
            int slength = arr.length - 1;
            while (i < (arr.length - 1)/2) {
                char f = arr[i];
                char s = arr[slength];

                System.out.println(f);
                System.out.println(s);

                if (f != s) {
                    check = false;
                }

                i++;
                slength--;
            }
        }
        return check;
    }
}
