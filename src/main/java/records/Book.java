package records;

public record Book(String title, String author, double price) {

    public Book {
        if(price < 0) {
            throw new IllegalArgumentException("Price cannot be < 0.");
        }
    }

    public double priceWithDiscount() {
        return price * 0.9;
    }
}
