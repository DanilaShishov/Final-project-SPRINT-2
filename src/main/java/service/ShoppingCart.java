package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;

        for (Food food : foods) {
            totalPrice += food.getAmount() * food.getPrice();
        }

        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;

        for (Food food : foods) {
            double priceWithoutDiscount = food.getAmount() * food.getPrice();

            if (food instanceof Discountable) {
                Discountable discountableFood = (Discountable) food;
                double discount = discountableFood.getDiscount();

                totalPrice += priceWithoutDiscount * (100 - discount) / 100;
            } else {
                totalPrice += priceWithoutDiscount;
            }
        }

        return totalPrice;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double totalPrice = 0;

        for (Food food : foods) {
            if (food.isVegetarian()) {
                totalPrice += food.getAmount() * food.getPrice();
            }
        }

        return totalPrice;
    }
}