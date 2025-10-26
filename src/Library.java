import java.util.ArrayList;

/**
 * ==========================================================
 * Kelas Library (versi ditingkatkan)
 * ==========================================================
 * Mewakili perpustakaan yang dapat menyimpan banyak buku.
 * Dilengkapi fitur tambah, hapus, cari buku, dan hitung total nilai koleksi.
 */
public class Library {
    private ArrayList<Book> books;
    private String location;

    public Library(String location) {
        this.books = new ArrayList<>();
        this.location = location;
    }

    // Getter & Setter
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    // Tambahkan buku ke perpustakaan
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book \"" + book.getTitle() + "\" added to library.");
    }

    // Hapus buku berdasarkan judul
    public void removeBook(String title) {
        boolean removed = books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Book \"" + title + "\" removed from library.");
        } else {
            System.out.println("Book \"" + title + "\" not found.");
        }
    }

    // Cari buku berdasarkan judul
    public Book searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found!");
                b.displayInfo();
                return b;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    // Tampilkan semua buku
    public void displayAllBooks() {
        System.out.println("=== " + location + " Library Book List ===");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                b.displayInfo();
            }
        }
    }

    // Hitung total nilai seluruh stok buku
    public double calculateTotalValue() {
        double total = 0;
        for (Book b : books) {
            total += b.getPrice() * b.getStock();
        }
        return total;
    }

    // Tampilkan informasi perpustakaan
    public void showLibraryInfo() {
        System.out.println("Library Location: " + location);
        System.out.println("Total Books: " + books.size());
        System.out.println("Total Value: $" + calculateTotalValue());
        System.out.println("==============================");
    }
}
