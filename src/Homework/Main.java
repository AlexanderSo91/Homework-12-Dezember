package Homework;

import java.util.Arrays;

public class Main {
    private static int i;

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {

        System.out.println("\nЗадача_1");

        int[] weights = new int[3];
        weights[0] = 1;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);

        weights[1] = 2;
        int februaryWeight = weights[1];
        System.out.println(februaryWeight);

        weights[2] = 3;
        int marchWeight = weights[2];
        System.out.println(marchWeight);


        double[] weights1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights1.length; i++)

            System.out.println(weights1[i]);


        String[] arr3 = {"a","b","c","d","e"};

    }


    public static void task2() {

        System.out.println("\nЗадача_2");

        int[] apple = new int[12];
        apple[0] = 1;
        int appleRed = 1;
        System.out.print(appleRed);


        apple[1] = 2;
        int februaryWeight = apple[1];
        System.out.print("," + februaryWeight);

        apple[2] = 3;
        int marchWeight = apple[2];
        System.out.println("," + marchWeight);

        double[] weights1 = {1.57, 7.654, 9.986};

        int i;
        for (i = 0; i < weights1.length; i++)
            System.out.print(", " + weights1[i]);
        if (i != weights1.length - 1) {
            System.out.println(",");
        }
    }






    public static void task3() {

        System.out.println("\nЗадача_3");

        int[] apple = new int[12];
        apple[0] = 1;
        int appleRed = 3;
        System.out.print(appleRed);



        apple[1] = 2;
        int februaryWeight = apple[1];
        System.out.print(","+februaryWeight);

        apple[2] = 1;
        int marchWeight = apple[2];
        System.out.println(","+marchWeight);

        double[] weights1 = {9.986,7.654,1.57,};
        for (int i = 0; i < weights1.length; i++)

            System.out.print(", "+weights1[i]);
    }

    public static void task4() {

        System.out.println("\nЗадача_4");

        int[] arr1 = {1,2,3};

        for (int i = 0; i < arr1.length; i++); {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;

            }
        }
        System.out.println(Arrays.toString(arr1));



    }
}






