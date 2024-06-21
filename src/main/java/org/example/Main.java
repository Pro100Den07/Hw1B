package org.example;

class Order {
    int orderNo;
    String clientName;
    String product;
    double price;
    String address;

    public Order(int orderNo, String clientName, String product, double price, String address) {
        this.orderNo = orderNo;
        this.clientName = clientName;
        this.product = product;
        this.price = price;
        this.address = address;
    }

    public void displayOrderDetails() {
        System.out.println("Order No " + orderNo + " Client: " + clientName);
        System.out.println("Product: " + product);
        System.out.println("Price EUR " + price);
        System.out.println("Address: " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "Alice", "smartphone", 305.99, "Moon Street, 10");
        Order order2 = new Order(2, "Tom", "laptop", 570.95, "Terra Street, 17");

        order1.displayOrderDetails();
        System.out.println();
        order2.displayOrderDetails();
    }
}