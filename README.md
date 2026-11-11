# Sistem Pemesanan Makanan

## 1. Deskripsi
Sistem Pemesanan Makanan merupakan aplikasi sederhana berbasis Java yang digunakan untuk menampilkan informasi pesanan pelanggan, menghitung total harga, dan menentukan diskon berdasarkan total pembelian.

## 2. Teknologi
- Java 19
- Maven
- IntelliJ IDEA

## 3. Fitur
- Menyimpan data pelanggan dan pesanan makanan.
- Menampilkan nama pelanggan, nama makanan, harga satuan, dan jumlah pesanan.
- Menghitung total harga sebelum diskon.
- Memberikan diskon 10% apabila total pesanan minimal Rp25.000.
- Menampilkan total pembayaran setelah diskon.

## 4. Struktur Kelas

### FoodOrder
Menyimpan data pesanan berupa nama pelanggan, nama makanan, harga satuan, dan jumlah pesanan. Atribut dibuat private dan diakses melalui getter.

### OrderService
Memproses pesanan, menghitung total harga, menentukan diskon, dan menampilkan rincian pembayaran.

### MainApp
Menjadi titik awal eksekusi aplikasi. Kelas ini membuat objek FoodOrder dan memanggil OrderService untuk memproses pesanan.

## 5. Cara Menjalankan
1. Buka proyek di IntelliJ IDEA.
2. Pastikan JDK 19 telah dikonfigurasi.
3. Buka file MainApp.java.
4. Jalankan method main().
5. Periksa hasilnya pada console.

## 6. Contoh Output

```text
=== SISTEM PEMESANAN MAKANAN ===
Nama Pelanggan: Fajar
Nama Makanan: Nasi Goreng
Harga: Rp15000
Jumlah: 2
Total Harga: Rp30000
Diskon: Rp3000.0
Total Pembayaran: Rp27000.0
```

## 7. Dokumentasi
Dokumentasi kelas dan method tersedia melalui komentar JavaDoc pada kode sumber.

## 8. Pengembang
Nama: Fajar Putra Pratama
Mata Kuliah: Pemrograman Lanjut