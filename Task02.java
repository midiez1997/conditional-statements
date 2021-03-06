package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * которая выведет приветствии для пользователя в зависимости от времени суток.
 * Известно:
 *
 * @param hour - текущее значение часов (от 0 до 23)
 * @return приветствие согласно шаблону 'Good morning/day/evening/night'
 */
public class Task02 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int hour = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);
        if (hour >= 0 & hour < 6) {
            System.out.println("Good night");
        } else if (hour >= 6 & hour < 12) {
            System.out.println("Good morning");
        } else if (hour >= 12 & hour < 18) {
            System.out.println("Good day");
        } else if (hour >= 18 & hour < 24) {
            System.out.println("Good evening");
        }

    }
}