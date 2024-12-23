package org.fred.perso.codingbat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CodingBatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodingBatApplication.class, args);
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int[] numbers = new int[]{a, b, c};

        Arrays.sort(numbers);

        int i = 1;
        if (Math.abs(numbers[i - 1] - numbers[i]) == Math.abs(numbers[i + 1] - numbers[i])) {
            return true;
        } else {
            return false;
        }
    }

    public static int makeChocolate(int small, int big, int goal) {
        if ((small + big * 5) < goal) {
            return -1;
        }

        int nbBig = 0;
        int nbSmall = 0;

        for (int i = 1; i <= big; i++) {
            if ((i * 5) <= goal) {
                nbBig++;
            }
        }

        int rest = goal - nbBig * 5;

        if (small >= rest) {
            return rest;
        } else {
            return -1;
        }
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);

    }

    public static int round10(int num) {
        double numToRound = (double) num / 10;
        int roundedNum = (int) Math.round(numToRound);
        return (int) roundedNum * 10;
    }

    public static boolean closeFar(int a, int b, int c) {
        boolean close = false;
        boolean far = false;

        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2) {
            return true;
        }

        if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2) {
            return true;
        }

        return false;
    }

    public static boolean makeBricks(int small, int big, int goal) {

        if ((small + big * 5) < goal) {
            return false;
        }

        int rest = goal % 5;

        if ((big != 0 && rest == 0) || (rest > 0 && rest <= small)) {
            return true;
        }

        return false;
    }

    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        boolean stop = true;

        if (a != 13) {
            sum += a;
            stop = false;
        }
        if (!stop && b != 13) {
            sum += b;
            stop = false;
        } else {
            stop = true;
        }
        if (!stop && c != 13) {
            sum += c;
        }

        return sum;

    }

    public static String doubleChar(String str) {
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            newString += c;
            newString += c;
        }

        return newString;
    }

    public static int countHi(String str) {
        int i = 0;
        int index = 0;

        while (!(index == -1)) {
            index = str.indexOf("hi", index);
            if (index != -1) {
                i++;
                index++;
            }
        }
        return i;
    }

    public static boolean catDog(String str) {
        int nbCat = 0;
        int nbDog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                nbDog++;
            }
            if (str.substring(i, i + 3).equals("cat")) {
                nbCat++;
            }
        }

        return nbDog == nbCat;
    }

    public static boolean endOther(String a, String b) {
        int index1 = a.toLowerCase().indexOf(b.toLowerCase());
        int index2 = b.toLowerCase().indexOf(a.toLowerCase());

        if (index1 != -1 && (index1 == a.length() - b.length())) {
            return true;
        }
        if (index2 != -1 && (index2 == b.length() - a.length())) {
            return true;
        }

        return false;
    }

}
