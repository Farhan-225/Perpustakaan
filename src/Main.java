/**
 * ==========================================================
 * Kelas Main
 * ==========================================================
 * Deskripsi:
 * Kelas ini merupakan entry point program.
 * Program ini membuat objek Book dan Library, menampilkan informasi,
 * serta menyesuaikan stok buku untuk memperlihatkan perubahan data.
 *
 * @author
 * Mochammad Farhan Hikmadi
 * @version
 * 1.0
 * @since
 * 2025-10-27
 */
public class Main {
    /**
     * Method utama (entry point) program.
     * Membuat objek Book dan Library, lalu menampilkan serta memperbarui datanya.
     *
     * @param args Argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        // Membuat objek Book
        int i = 1+1;
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 10.2, 2);

        // Membuat objek Library
        Library lib = new Library(book1, "Perpustakaan Kota");

        // Display initial information
        lib.showLibraryInfo();

        // Add more stock
        book1.adjustStock(5);

        // Display updated information
        lib.showLibraryInfo();
    }
}
