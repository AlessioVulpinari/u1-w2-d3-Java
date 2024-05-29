package exercise_3;

import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Il Signore degli Anelli: Le due Torri", "Books", 40);
        Product product2 = new Product("Il Signore degli Anelli: La Trilogia Completa.", "Books", 120);
        Product product3 = new Product("Harry Potters collections", "Books", 150);
        Product product4 = new Product("iPhone 15 Pro Max", "Mobile", 1500);
        Product product5 = new Product("Action Man figure", "Boys", 30);
        Product product6 = new Product("Batmobile", "Boys", 55);

        Product[] arrayProducts = {product1, product2, product3, product4, product5, product6};
        List<Product> products = Arrays.stream(arrayProducts).toList();
        Customer customer1 = new Customer("Davide", 4);

        Order order1 = new Order("In consegna", LocalDate.now().minusDays(1), LocalDate.now().plusDays(4), products, customer1);

        List<Product> boysProduct = order1.getProducts().stream().filter(product -> Objects.equals(product.getCategory(), "Boys")).toList();
        boysProduct.forEach(product -> product.setPrice(product.getPrice() * 0.9));
        System.out.println(boysProduct);
    }
}
