package exercise_1;

import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Il Signore degli Anelli: Le due Torri.", "Books", 40);
        Product product2 = new Product("Il Signore degli Anelli: La Trilogia Completa.", "Books", 120);
        Product product3 = new Product("Harry Potters collections", "Books", 150);
        Product product4 = new Product("iPhone 15 Pro Max", "Mobile", 1500);
        Product[] arrayProducts = {product1, product2, product3, product4};
        List<Product> products = Arrays.stream(arrayProducts).toList();
        Customer customer1 = new Customer("Alessio", 5);

        Order order1 = new Order("In consegna", LocalDate.now(), LocalDate.now().plusDays(4), products, customer1);

        List<Product> books = order1.getProducts().stream().filter(product -> Objects.equals(product.getCategory(), "Books") && product.getPrice() > 100).toList();
        System.out.println(books.toString());
    }
}
