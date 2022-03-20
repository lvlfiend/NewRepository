package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //String [] a = {"Окно"};
        //String [] а1 = {"Стол"};
        // Сравнивает два массива лексикографически.boolean, нет в 8
        //System.out.println(Arrays.compare(a, a1));

        int[] b = {1,3,6};
        int[] b1 = Arrays.copyOf(b, b.length);
        int a = 1;
        //Копирует указанный массив, усекая или заполняя
        System.out.println(Arrays.toString(b1));
        System.out.println("----------");
        //Возвращает значение, если два указанных массива логических значений равны друг другу.true
        System.out.println(Arrays.equals(b, b1));
        System.out.println("----------");
        //Присваивает указанное логическое значение каждому элементу указанного массива логических значений.
        Arrays.fill(b, a);
        System.out.println(Arrays.toString(b));
        System.out.println("----------");
        //Возвращает хэш-код, основанный на содержимом указанного массива.
        System.out.println(Arrays.hashCode(b));
        System.out.println(Arrays.hashCode(b1));
        System.out.println("----------");
        //Находит и возвращает индекс первого несоответствия между двумя массивами, нет в 8
        //System.out.println(Arrays.mismatch(b, b1));
        //Кумулирует, параллельно, каждый элемент заданного массива на месте, используя предоставленную функцию.
        int[] c = {1, 2, 3, 4, 5, 6};
        Arrays.parallelPrefix(c, (x,y) -> x+y);
        System.out.println(Arrays.toString(c));
        System.out.println("----------");
        //Задайте все элементы указанного массива, используя предоставленную функцию генератора для вычисления каждого. индекс
        Arrays.setAll(c, i -> i);
        System.out.println(Arrays.toString(c));
        System.out.println("----------");
        //Сортирует указанный массив в порядке возрастания чисел.
        int[] d = {2, 1, 5, 3, 4};
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        System.out.println("----------");
        //Возвращает значение типа Spliterator.OfInt, охватывающее весь указанный массив. Не понял.
        Arrays.spliterator(d);
        System.out.println(Arrays.toString(d));
        System.out.println("----------");
        //Возвращает последовательный объект IntStream с указанным массивом в качестве источника. не понял
        int[] e = {1, 3, 4, 2};
        Arrays.stream(e);
        System.out.println(Arrays.toString(e));
    }
}
