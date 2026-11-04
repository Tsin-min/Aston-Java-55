package org.example;

public class Bowl {
        private int food;

        public Bowl(int food) {
            this.food = Math.max(food, 0);
        }

        public boolean tryTakeFood(int amount) {
            if (amount <= 0 || food < amount) {
                return false;
            }
            food -= amount;
            return true;
        }

        public void addFood(int amount) {
            if (amount > 0) {
                food += amount;
            }
        }

        public int getFood() { return food; }
    }
