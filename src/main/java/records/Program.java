package records;

public class Program {
    public static void main(String[] args) {
        Book book1 = new Book("Collections in Java", "Ed K", 23.2);
        Book book2 = new Book("Collections in Java", "Ed K", 23.2);
        Book book3 = new Book("Java Generics e Collections", "Mary J", 31.9);

        System.out.println(book1);
        System.out.printf("\tPrice with discount: %.2f€\n", book1.priceWithDiscount());

        System.out.println(book2);
        System.out.printf("\tPrice with discount: %.2f€\n", book2.priceWithDiscount());

        System.out.println(book3);
        System.out.printf("\tPrice with discount: %.2f€\n", book3.priceWithDiscount());

        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false
        System.out.println(book2.equals(book3)); // false
    }
}
