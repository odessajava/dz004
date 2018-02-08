package com.company;

import javafx.beans.property.SimpleObjectProperty;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ArraysExample_1();
        //ArraysExample_2();
        //ArraysExample_3();
        //ArraysExample_4();
        ArraysExample_6();



    }

    private static void ArraysExample_1() {
        System.out.println("\nОдномерные массивы. Пример 1. Библиотека.");

        Random random = new Random();
        int[] array = new int[35];
        int books = 0;
        int countOfNumbers = 0;
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(100000);

        System.out.print("\nКоличество книг в разделах библиотеки: ");


        for (int a : array) {
            System.out.println(a + " ");
            books = books + a;
        }
        System.out.print("\nКоличество книг в библиотеке: " + books);

        //Цикл ниже честно списал.
        for (; books != 0; books /= 10)
            ++countOfNumbers;
        System.out.println("\nКоличество цифр: " + countOfNumbers);


    }

    private static void ArraysExample_2() {
        System.out.println("\nОдномерные массивы. Пример 2. Спортсмены.");
        int[] array = new int[10];
        int checkpoint=0;
        int checkpointSum=0;

        array [0]=5;
        array [1]=1;
        array [2]=4;
        array [3]=5;
        array [4]=5;
        array [5]=1;
        array [6]=2;
        array [7]=5;
        array [8]=3;
        array [9]=5;

        System.out.println("\nВведите проходной балл от 0 до 50.");
        checkpoint= scanner.nextInt();
        for (int a : array) {
            checkpointSum = checkpointSum + a;
        }
        if (checkpointSum >= checkpoint)
        {
            System.out.println("Спортсмен в следующий этап вышел.");
        } else
        {
            System.out.println("Спортсмен в следующий этап не вышел.");
        }



    }
    private static void ArraysExample_3(){
        System.out.println("\nОдномерные массивы. Пример 3. Фигурное катание.");
        Random random = new Random();
        int[] array = new int[18];
        double sum1=0;
        double sum2=0;
        double sum3=0;
        System.out.println("\nОценки спортсмена:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println("\nОценки по обязательной программе:");

        for (int i = 0; i <6; i++){
            System.out.print(array[i] + " ");
            sum1=sum1+array[i];
        }
        System.out.println("\nСредняя оценка: " + sum1/6);

        System.out.println("\nОценки по короткой программе:");

        for (int i = 6; i <12; i++){
            System.out.print(array[i] + " ");
            sum2=sum2+array[i];
        }
        System.out.println("\nСредняя оценка: " + sum2/6);

        System.out.println("\nОценки по произвольной программе:");

        for (int i = 12; i <18; i++){
            System.out.print(array[i] + " ");
            sum3=sum3+array[i];
        }
        System.out.println("\nСредняя оценка: " + sum3/6);

        //Предполагаем, что равных значений нет.
        if (sum1>sum2 && sum1>sum3){
            System.out.println("\nМаксимальный балл в обязательной программе");
        }
        else if (sum2>sum1 && sum2>sum3){
            System.out.println("\nМаксимальный балл в короткой программе");
        }
        else {
            System.out.println("\nМаксимальный балл в произвольной программе.");
        }




    }
    private static void ArraysExample_4(){
        System.out.println("\nОдномерные массивы. Пример 4. Количество чисел.");
        Random random = new Random();
        double [] array = new double[20];
        int[] count =new int[20]; // 20-пальцем в небо.
        int check=0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble()-0.5; //Другого способа для ввода положительных и отрицательных чисел не нашел.
            System.out.println(array[i]);
        }

        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]>0){
                check=check+1;
                count[i]=check;
            }
            else check=0;

        }
        check=0;
        for (int i = 0; i < count.length; i++){
            if (count[i]>check)check=count[i];

        }
        System.out.println( "Наибольшее количество последовательно расположенных положительных чисел равно "+ check);


    }
    private static void ArraysExample_6(){
        System.out.println("\nОдномерные массивы. Пример 6. Замена максимальных и минимальных значений нулями");
        Random random = new Random();
        int[] array = new int[20];
        int max=0;
        int min=100;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i=0;i<array.length;i++){
            if (array[i]>max) max=array[i];
            if (array[i]<min) min=array[i];
        }
        for (int i=0;i<array.length;i++){
            if (array[i]==max) array[i]=0;
            if (array[i]==min) array[i]=0;
            System.out.print(array[i] + " ");
        }

    }
}
