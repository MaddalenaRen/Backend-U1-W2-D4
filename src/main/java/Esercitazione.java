import java.time.LocalDate;
import java.util.List;

public class Esercitazione {
    public static void main(String[] args) {
        Product p1 = new Product(1L, "Il signore degli Anelli", "Books", 10.0);
        Product p2 = new Product(2L, "Il nome della rosa", "Books", 101.0);
        Product p3 = new Product(3L, "pannolini", "Baby", 4.0);
        Product p4 = new Product(4L, "maglietta", "Baby", 7.0);
        Product p5 = new Product(5L, "carrozzina", "Baby", 70.0);
        Product p6 = new Product(6L, "scarpe", "Boys", 60.0);
        Product p7 = new Product(7L, "pantalone", "Boys", 30.0);
        Product p8 = new Product(8L, "felpa", "Boys", 30.0);

        List<Product> prodotti = List.of(p1, p2,p3,p4,p5,p6,p7,p8);

        Customer c1 = new Customer(1L, "Sara", 1);
        Customer c2 = new Customer(2L, "Roberto", 2);
        Customer c3 = new Customer(3L, "Carlo", 2);

        Order o1 = new Order(1L, "ordinato", LocalDate.of(2021, 1,1), LocalDate.of(2021, 2,1));
        Order o2 = new Order(2L, "ordinato", LocalDate.of(2021, 3,1), LocalDate.of(2021, 3,2));
        Order o3 = new Order(3L, "ordinato", LocalDate.of(2021, 3,12), LocalDate.of(2021, 3,13));

        o1.setCustomer(c1);
        o1.setProdotti(List.of(p1,p2,p3));

        o2.setCustomer(c2);
        o2.setProdotti(List.of(p4,p5,p6));

        o3.setCustomer(c3);
        o3.setProdotti(List.of(p7,p8));
    }
}
