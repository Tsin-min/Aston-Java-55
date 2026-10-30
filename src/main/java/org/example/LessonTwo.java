package org.example;

import java.time.LocalDate;

    public class LessonTwo {
        public static void main(String[] args) {
            // 1. Создать класс "Товар" с полями:
            // название,
            // дата производства,
            // производитель,
            // страна происхождения,
            // цена,
            // состояние бронирования покупателем.
            //Конструктор класса должен заполнять эти поля при создании объекта.
            //Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
            Товар товар = new Товар(
                    "Кошачий корм ProBalance",
                    LocalDate.of(2026, 10, 25),
                    "AO 'Лимкорм Петфуд'",
                    "Россия",
                    3760,
                    true
            );
            товар.вывестиИнформацию();

            // 2. Создать массив из 5 товаров.
            Product[] productsArray = new Product[5];
            productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
            productsArray[1] = new Product("Sony WH-1000XM5", "15.03.2025", "Sony Corporation", "Japan", 3299, true);
            productsArray[2] = new Product("MacBook Air M3", "20.01.2025", "Apple Inc.", "USA", 11999, false);
            productsArray[3] = new Product("Canon EOS R6 Mark II", "10.04.2025", "Canon Inc.", "Japan", 14500, true);
            productsArray[4] = new Product("Xiaomi Mi Band 8", "05.02.2025", "Xiaomi Corporation", "China", 499, true);

            for (int i = 0; i < productsArray.length; i++) {
                System.out.println("Товар №" + (i + 1) + ": " + productsArray[i]);
            }
            //3. Создать класс Park с внутренним классом,
            // с помощью объектов которого можно хранить информацию об аттракционах,
            // времени их работы и стоимости.
            Park myPark = new Park("Солнечный парк");

            Park.Attraction rollerCoaster = myPark.new Attraction("Американские горки", "10:00–22:00", 350.0);
            Park.Attraction ferrisWheel = myPark.new Attraction("Колесо обозрения", "11:00–23:00", 250.0);
            Park.Attraction carousel = myPark.new Attraction("Карусель", "09:00–21:00", 150.0);

            System.out.println("Парк: " + myPark.parkName);
            System.out.println();
            rollerCoaster.printInfo();
            ferrisWheel.printInfo();
            carousel.printInfo();
        }
    }
