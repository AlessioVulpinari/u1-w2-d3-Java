package exercise_2;

import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Il Signore degli Anelli: Le due Torri.", "Books", 40);
        Product product2 = new Product("Il Signore degli Anelli: La Trilogia Completa.", "Books", 120);
        Product product3 = new Product("Harry Potters collections", "Books", 150);
        Product product4 = new Product("iPhone 15 Pro Max", "Mobile", 1500);
        Product product5 = new Product("pampers pannolini maxi 20 pezzi", "Baby", 15);
        Product product6 = new Product("Ciuccio 3000", "Baby", 150);

        Product[] arrayProducts = {product1, product2, product3, product4, product5, product6};
        Product[] arrayProducts1 = {product5, product6};
        Product[] arrayProducts2 = {product1, product2, product3};

        List<Product> products = Arrays.stream(arrayProducts).toList();
        List<Product> products1 = Arrays.stream(arrayProducts1).toList();
        List<Product> products2 = Arrays.stream(arrayProducts2).toList();

        Customer customer1 = new Customer("Alessio", 5);
        Customer customer2 = new Customer("Federico", 3);
        Customer customer3 = new Customer("Cristian", 2);

        Order order1 = new Order("In consegna", LocalDate.now(), LocalDate.now().plusDays(4), products, customer1);
        Order order2 = new Order("Non consegnato", LocalDate.now(), LocalDate.now().plusDays(5), products1, customer2);
        Order order3 = new Order("In preparazione", LocalDate.now().minusDays(2), LocalDate.now().plusDays(2), products2, customer3);

        List<Order> babyOrders = new ArrayList<>();
        babyOrders.add(order1);
        babyOrders.add(order2);
        babyOrders.add(order3);

        babyOrders = babyOrders.stream().filter(order -> order.getProducts().stream().anyMatch(product -> Objects.equals(product.getCategory(), "Baby"))).toList();

        System.out.println(babyOrders);
    }
}
