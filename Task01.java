package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * После каждого боя выводится таблица статистики боя для команды. Расположение в данной таблице зависит
 * от урона нанесенного в бою. Всего в команде 15 игроков. Определить вошел ли игрок в ТОП-5 игроков своей команды,
 * если известно:
 *
 * @param positionPlayerByDamage - позиция игрока по убыванию урона в своей команде
 * @return 'true'/'false'
 */
public class Task01 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int positionPlayerByDamage = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int num1 = 16;
        int num2 = 44;
        int num3 = 21;
        int num4 = 59;
        int num5 = 60;
        int num6 = 89;
        int num7 = 53;
        int num8 = 4;
        int num9 = 25;
        int num10 = 95;
        int num11 = 6;
        int num12 = 30;
        int num13 = 80;
        int num14 = 44;
        int num15 = 66;
        if (num1 > num2 && num1 > 7) {

    }
}