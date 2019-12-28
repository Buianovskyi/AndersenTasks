package io.github.tasks;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        System.out.println("Введите любое имя: ");
        Scanner scan2 = new Scanner(System.in);
        String phrase = scan2.nextLine();
        if (phrase.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, " + phrase);
        } else System.out.println("Нет такого имени");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы массива кратные 3: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0)
                System.out.print(arr[i] + " ");

        }
    }
}
