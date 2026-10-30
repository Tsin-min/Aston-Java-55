package org.example;

import java.time.LocalDate;

public class Товар {
    private String Название;
    private LocalDate ДатаПроизводства;
    private String Производитель;
    private String СтранаПроисхождения;
    private double Цена;
    private boolean СостояниеБронированияПокупателем;

    public Товар(String Название,LocalDate ДатаПроизводства,String Производитель,String СтранаПроисхождения,
                 double Цена, boolean СостояниеБронированияПокупателем) {
        this.Название = Название;
        this.ДатаПроизводства = ДатаПроизводства;
        this.Производитель = Производитель;
        this.СтранаПроисхождения = СтранаПроисхождения;
        this.Цена =Цена;
        this.СостояниеБронированияПокупателем = СостояниеБронированияПокупателем;
    }
    public void вывестиИнформацию() {
        System.out.println("--- Информация о товаре ---");
        System.out.println("Название: " + Название);
        System.out.println("Дата производства: " + ДатаПроизводства);
        System.out.println("Производитель: " + Производитель);
        System.out.println("Страна происхождения: " + СтранаПроисхождения);
        System.out.println("Цена: " + Цена + " руб.");
        System.out.println("Состояние бронирования: " +
                (СостояниеБронированияПокупателем ? "Забронирован" : "Свободен"));
        System.out.println("---------------------------");
    }
    public String getНазвание() {
        return Название;
    }
    public LocalDate getДатаПроизводства() {
        return ДатаПроизводства;
    }
    public double getЦена() {
        return Цена;
    }
    public boolean isСостояниеБронированияПокупателем() {
        return СостояниеБронированияПокупателем;
    }
}

