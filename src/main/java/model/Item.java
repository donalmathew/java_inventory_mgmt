package model;
import java.util.Scanner;

public class Item {
    Scanner scanner = new Scanner(System.in);

    String name;
    int quantity;
    int price;

    public void setName() {
        System.out.println("enter the name: ");
        name = scanner.nextLine();
    }

    public void setQuantity() {
        System.out.println("enter the quantity: ");
        quantity = scanner.nextInt();
    }

    public void setPrice() {
        System.out.println("enter the price: ");
        price = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
