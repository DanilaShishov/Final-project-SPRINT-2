import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] foods = {meat, redApples, greenApples};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println(String.format("Общая сумма без скидки: %s", shoppingCart.getTotalPriceWithoutDiscount()));
        System.out.println(String.format("Общая сумма со скидкой: %s", shoppingCart.getTotalPriceWithDiscount()));
        System.out.println(String.format("Сумма вегетарианских продуктов без скидки: %s", shoppingCart.getTotalVegetarianPriceWithoutDiscount()));
    }
}
