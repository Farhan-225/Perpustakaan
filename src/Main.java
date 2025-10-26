/**
 * ==========================================================
 * Kelas Main (versi ditingkatkan)
 * ==========================================================
 * Program utama untuk mengelola perpustakaan.
 * Menambahkan beberapa buku, menampilkan daftar, dan mencari buku.
 */
public class Main {
    public static void main(String[] args) {

        // Membuat perpustakaan baru
        Library library = new Library("Perpustakaan Kota");

        // Tambahkan beberapa buku
        Book b1 = new Book("Harry Potter", "J.K. Rowling", 10.2, 5);
        Book b2 = new Book("Lord of The Rings", "J.R.R. Tolkien", 12.5, 3);
        Book b3 = new Book("Clean Code", "Robert C. Martin", 20.0, 2);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println();

        // Tampilkan semua buku
        library.displayAllBooks();

        // Cari buku tertentu
        library.searchBook("clean code");

        // Ubah stok buku
        b1.adjustStock(3);

        // Hapus buku
        library.removeBook("Lord of The Rings");

        // Tampilkan info perpustakaan setelah update
        library.showLibraryInfo();
        library.displayAllBooks();
    }
}
