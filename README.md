# 📚 Java Library Management Program

## 📝 Deskripsi
Program ini dibuat menggunakan bahasa **Java** untuk memodelkan sistem sederhana antara **Buku (Book)** dan **Perpustakaan (Library)**.  
Program menampilkan bagaimana konsep **OOP (Object-Oriented Programming)** diterapkan melalui **encapsulation**, **method extraction**, dan **penggunaan konstanta**.

---

## 🧩 Struktur Kelas
1. **Book.java**
    - Menyimpan informasi tentang buku: judul, penulis, harga, dan stok.
    - Memiliki fitur:
        - Menampilkan info buku.
        - Menghitung harga setelah diskon.
        - Mengubah jumlah stok buku.

2. **Library.java**
    - Mewakili perpustakaan yang memiliki lokasi dan koleksi buku.
    - Menyediakan method untuk menampilkan informasi perpustakaan dan buku.

3. **Main.java**
    - Titik masuk utama program.
    - Membuat objek `Book` dan `Library`, lalu menampilkan informasi sebelum dan sesudah perubahan stok.

---

## ⚙️ Cara Menjalankan Program

1. Simpan ketiga file berikut dalam satu folder:
    - `Book.java`
    - `Library.java`
    - `Main.java`

2. Buka terminal atau command prompt di direktori yang sama.

3. Jalankan perintah berikut untuk **mengompilasi**:
   ```bash
   javac Main.java Book.java Library.java
