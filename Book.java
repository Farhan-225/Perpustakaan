/**
 * ==========================================================
 * Kelas Book
 * ==========================================================
 * Deskripsi:
 * Kelas ini merepresentasikan sebuah buku yang memiliki atribut
 * judul, penulis, harga, dan stok. Dilengkapi dengan method untuk
 * menampilkan informasi buku, menghitung harga diskon, serta
 * menyesuaikan stok buku.
 *
 * @author
 * Mochammad Farhan Hikmadi
 * @version
 * 1.0
 * @since
 * 2025-10-27
 */
public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    /** Konstanta untuk menentukan besarnya diskon. */
    public static final double DISCOUNT_RATE = 0.1;

    /**
     * Konstruktor untuk membuat objek Book baru.
     *
     * @param title  Judul buku
     * @param author Nama penulis
     * @param price  Harga buku
     * @param stock  Jumlah stok buku
     */
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    /** @return Judul buku */
    public String getTitle() {
        return title;
    }

    /** @param title Judul buku yang baru */
    public void setTitle(String title) {
        this.title = title;
    }

    /** @return Nama penulis */
    public String getAuthor() {
        return author;
    }

    /** @param author Nama penulis yang baru */
    public void setAuthor(String author) {
        this.author = author;
    }

    /** @return Harga buku */
    public double getPrice() {
        return price;
    }

    /** @param price Harga buku yang baru */
    public void setPrice(double price) {
        this.price = price;
    }

    /** @return Jumlah stok buku */
    public int getStock() {
        return stock;
    }

    /** @param stock Jumlah stok buku yang baru */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Menghitung harga buku setelah diskon diterapkan.
     *
     * @return Harga buku setelah diskon
     */
    public double calculateDiscount() {
        return price - (price * DISCOUNT_RATE);
    }

    /**
     * Menampilkan informasi lengkap buku, termasuk harga diskon.
     */
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Discounted Price: $" + calculateDiscount());
        System.out.println("Stock: " + getStock());
    }

    /**
     * Menyesuaikan stok buku (menambah atau mengurangi).
     *
     * @param adjustment Jumlah perubahan stok
     */
    public void adjustStock(int adjustment) {
        stock += adjustment;
        System.out.println("Stock adjusted.");
        System.out.println("Current stock: " + stock);
    }
}
