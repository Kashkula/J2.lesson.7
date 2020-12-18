package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        // создаём три словаря из стрингов
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();


        // метод сортирующий словарь
        Comparator<String> comparator = (o1, o2) -> {
            Integer i1 = o1.length();
            Integer i2 = o2.length();
            return i1.compareTo(i2);
        };
        addList(A);
        print(A);


        // создаём iterator создаём из листа
        Iterator<String> iteratorA = A.iterator();
        addList(B);
        print(B);

        // создаём iterator создаём из листа
        Iterator<String> iteratorB = B.iterator();
        // Collections.reverse() - переворачивает словарь
        Collections.reverse(B);

        // Проверка, есть текущие имена
        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            // добавляем имена по очередности
            C.add(iteratorA.next());
            C.add(iteratorB.next());
        }

        // распечатка словаря С
        print(C);
        // тут вызываем метод, который сортирует по длине
        C.sort(comparator);
        // распечатка словаря C
        print(C);
    }

    private static void print(ArrayList<String> list) {
        System.out.println("Ваш список!");
        //iterator - нужен для распечатки list
        Iterator<String> iterator = list.iterator();
        //hasNext() - проверяет, есть ли текущее имя
        while (iterator.hasNext()) {
            // next() - текущее имя возвращает
            System.out.println(iterator.next());
        }


    }

    private static void addList(ArrayList<String> list) throws InterruptedException {
        System.out.println("Введите пять имён!");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            list.add(name);
            // добавляем время
            Thread.sleep(1000);
        }
        System.out.println("Поздравляю, вы заполнили словарь!");
    }



    /*
    a)  В задании нельзя использовать циклы for и for each. Только while и Iterator

b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
c)  Затем программа должна отобразить этот список
d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б.
 После также отображает его в консоли
e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
f)  После объединения отобразить в консоли список С
g)   В конце отсортировать элементы списка С по длине слова,
 сначала идут String-и с наименьшим количеством символов,
 и распечатать отсортированный список С.

     */
}
