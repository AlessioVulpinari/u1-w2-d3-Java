package entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Product {
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Product(String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.setStatus(status);
        this.setOrderDate(orderDate);
        this.setDeliveryDate(deliveryDate);
        this.setProducts(products);
        this.setCustomer(customer);
        Random random = new Random();
        this.setId(random.nextLong(0, 1000000));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
