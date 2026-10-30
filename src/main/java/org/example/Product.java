package org.example;

public class Product {
        private String name;
        private String releaseDate;
        private String manufacturer;
        private String country;
        private int price;
        private boolean inStock;

        public Product(String name, String releaseDate, String manufacturer,
                       String country, int price, boolean inStock) {
            this.name = name;
            this.releaseDate = releaseDate;
            this.manufacturer = manufacturer;
            this.country = country;
            this.price = price;
            this.inStock = inStock;
        }
        @Override
        public String toString() {
            return name + " | Цена: " + price + " ₽ | Производитель: " + manufacturer +
                    " | Страна: " + country + " | Дата релиза: " + releaseDate +
                    " | В наличии: " + (inStock ? "Да" : "Нет");
        }
    }