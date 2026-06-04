
import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
  public static void main(String[] args){

    Meat meat = new Meat(5, 100);
    Apple redAplless = new Apple(10, 50,Colour.RED);
    Apple greenAplless = new Apple(8, 60,Colour.GREEN);

    Food[] foods = {meat, redAplless, greenAplless};

    ShoppingCart shoppingCart = new ShoppingCart(foods);

    System.out.println("Общая сумма без скидки: " + shoppingCart.getTotalPriceWithoutDiscount());
    System.out.println("Общая сумма со скидкой: " + shoppingCart.getTotalPriceWithDiscount());
    System.out.println("Сумма вегетарианских продуктов без скидки: " + shoppingCart.getTotalVegetarianPriceWithoutDiscount());

  }

}