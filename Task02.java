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

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        if (h > 3 && h < 7) document.writeln("Доброй ночи");
        if (h > 6 && h < 12) document.writeln("Доброе утро");
        if (h > 11 && h < 17) document.writeln("Добрый день");
        if (h > 16 && h < 24) document.writeln("Добрый вечер");
        if (h > 23 || h < 4 ) document.writeln("Доброй ночи");
    }
}