package by.cdptr.javabasics.l4_3;

import java.util.Random;
import java.util.Scanner;

public class IncSeq {

    public static int enterNumber() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {

            System.out.println("Введено невалидное число! Попробуйте снова");
            scan.next();

        }

        return scan.nextInt();

    }

    public static int noZerosAllowed(int x) {

        while (x <= 0) {

            System.out.println("Число не может быть меньше нуля либо равно ему! Попробуйте снова");
            x = enterNumber();

        }

        return x;

    }

    public static int[] fillArrayWithRandomNumbers(int x) {

        int[] arr = new int[x];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(100);

        }

        return arr;

    }

    public static boolean checkIncrease(int[] arr) {

        boolean b = true;

        for (int i = 0; i < arr.length; i++) {

            if ((i + 1) < arr.length && arr[i] > arr[i + 1]) {

                b = false;
                break;

            }

        }

        return b;

    }

    public static boolean checkDecrease(int[] arr) {

        boolean c = true;

        for (int i = 0; i < arr.length; i++) {

            if ((i + 1) < arr.length && arr[i] < arr[i + 1]) {

                c = false;
                break;

            }

        }

        return c;

    }

    public static String returnResult(boolean x, boolean y) {

        String strInc = "Последовательность является возрастающей";

        String strChaotic = "Последовательность не является ни возрастающей, ни убывающей";

        String strDec = "Последовательность является убывающей";

        if (x == true && y == false) {

            return strInc;

        } else if (x == false && y == true) {

            return strDec;

        } else {

            return strChaotic;

        }

    }

}

