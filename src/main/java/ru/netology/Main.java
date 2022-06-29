package ru.netology;


public class Main {
    public static void main(String[] args) {
        AfishaElement first = new AfishaElement(1, "Бладшот", "боевик", "ya.ru",false);
        AfishaElement second = new AfishaElement(5, "Вперед", "мультфильм", "yandex.ru",true);
        AfishaElement third = new AfishaElement(7, "Отель Белград", "комедия", "ya.ru",false);
        AfishaElement forth = new AfishaElement(10, "Джентельмены", "боевик", "ya.ru",false);
        AfishaElement fifth = new AfishaElement(15, "Человек-невидимка", "ужасы", "yandex.ru",true);
        AfishaElement sixth = new AfishaElement(100, "Тролли. Мировой тур", "мультфильм", "ya.ru",false);
        AfishaElement seventh = new AfishaElement(900, "Номер один", "комедия", "ya.ru",false);


        afisha manager = new afisha();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        afisha manager2 = new afisha(5);
        manager2.add(first);
        manager2.add(second);
        manager2.add(third);
        manager2.add(forth);
        manager2.add(fifth);
        manager2.add(sixth);
        manager2.add(seventh);

        AfishaElement[] all = manager.findAll();
        AfishaElement[] lastAll = manager.findLast();
        AfishaElement[] lastAll2 = manager2.findLast();
    }
}
