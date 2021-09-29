package Lesson3;

import java.lang.reflect.Array;

public class HomeWork_3 {
    public static void main (String[] args) {
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */
        int[] array1 = {1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0};
        printArray1("1. Before:\t", array1);
        change(array1);
        printArray1("After:\t", array1);


        /* 2. Задать пустой целочисленный массив длиной 100. 
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        */
        int[] array2 = new int[100];
        fillIn(array2);
        printArray1("2. Fillled with cycle:\t", array2);


        /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
        пройти по нему циклом, и числа меньшие 6 умножить на 2;
        */
        int[] array3 = {1,5,3,2,11,4,5,2,4,8,9};
        printArray1("3. Before:\t", array3);
        doubling(array3);
        printArray1("3. After:\t", array3);


        /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
        (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу: 
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        */
        int side = 8;
        int[][] array4  = new int[side][side];
        crossFill(array4);
        printArray2("4. Result fill diagonals", array4);


        /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, 
        и возвращающий одномерный массив типа int длиной len, 
        каждая ячейка которого равна initialValue;
        */
        int[] returnArrayFromMethod = returnArray(10, 999);
        printArray1("5. Array from method", returnArrayFromMethod);

    }

     /* ОДНОМЕРНЫЙ МАССИВ ДЛЯ ЗАДАНИЙ 1-3 */

     public static void printArray1(String  msg, int [] inputArray) {
        System.out.print(msg + ": "); 
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
            } 
        }

    /*конец одномерного массива*/

    /* ДВУМЕРНЫЙ МАССИВ ДЛЯ ЗАДАНИЙ 4 И 5 */

    public static void printArray2(String msg, int[][] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* конец двумерного массива */

    /*Методы для решения заданий 1-3, 5*/

    /*Задание 1*/
    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
        if (array[i] == 1) {
            array[i] = 0;
        }
        else {array[i] = 1;};
    }

    /*Задание 2*/
    public static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
        array[i] = i + 1;
    }

    /*Задание 3*/
    public static void doubling(int[] array) {
        for (int i = 0; i <array.length; i++)
        if (array[i] < 6)
        array[i] *=2;
    }

    /*Задание 5*/
    public static int[] returnArray(int len, int initValue) {
        int[] tempArray = new int [len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return tempArray;
    }

    /*Методы для решения заданий 4*/  

    /*Задание 4*/
    public static void crossFill(int[][] arr) {
        int i = 1;
        arr[i][i] = 1;
        arr[i][arr.length - 1 - i] = 1;
    }

}








}
