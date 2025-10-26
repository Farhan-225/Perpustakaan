/**
 * ==========================================================
 * Kelas Book (versi ditingkatkan)
 * ==========================================================
 * Mewakili sebuah buku dengan atribut judul, penulis, harga, dan stok.
 * Menyediakan method untuk menampilkan info, menghitung diskon, dan mengatur stok.
 */
public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    public static final double DISCOUNT_RATE = 0.1;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Hitung harga diskon
    public double calculateDiscount() {
        return price - (price * DISCOUNT_RATE);
    }

    // Tambah atau kurangi stok
    public void adjustStock(int adjustment) {
        stock += adjustment;
        if (stock < 0) stock = 0;
        System.out.println("Stock adjusted. Current stock: " + stock);
    }

    // Tampilkan informasi buku
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Discounted Price: $" + calculateDiscount());
        System.out.println("Stock: " + stock);
        System.out.println("---------------------------");
    }
}
