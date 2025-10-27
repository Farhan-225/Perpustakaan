/**
 * ==========================================================
 * Kelas Library
 * ==========================================================
 * Deskripsi:
 * Kelas ini merepresentasikan sebuah perpustakaan yang memiliki
 * lokasi dan menyimpan satu objek Book. Menyediakan method untuk
 * menampilkan informasi perpustakaan dan buku yang tersedia.
 *
 * @author
 * Mochammad Farhan Hikmadi
 * @version
 * 1.0
 * @since
 * 2025-10-27
 */
public class Library {
    private Book book;
    private String location;

    /**
     * Konstruktor untuk membuat objek Library baru.
     *
     * @param book     Objek buku yang ada di perpustakaan
     * @param location Lokasi perpustakaan
     */
    public Library(Book book, String location) {
        this.book = book;
        this.location = location;
    }

    /** @return Objek Book */
    public Book getBook() {
        return book;
    }

    /** @param book Objek Book yang baru */
    public void setBook(Book book) {
        this.book = book;
    }

    /** @return Lokasi perpustakaan */
    public String getLocation() {
        return location;
    }

    /** @param location Lokasi perpustakaan yang baru */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Menampilkan informasi lokasi perpustakaan
     * dan data buku yang ada di dalamnya.
     */
    public void showLibraryInfo() {
        System.out.println("Library Location: " + getLocation());
        book.displayInfo();
    }
}

