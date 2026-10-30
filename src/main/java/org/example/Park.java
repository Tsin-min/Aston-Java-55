package org.example;

public class Park {
    protected String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }
    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " руб.");
            System.out.println("-------------------------");
        }
        public String getName() {
            return name;
        }
        public double getCost() {
            return cost;
        }
    }
}
