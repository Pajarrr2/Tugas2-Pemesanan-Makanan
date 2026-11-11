
package com.example.tugas3proglanafter;

/**
 * Merepresentasikan pesanan makanan dari seorang pelanggan.
 * Kelas ini menyimpan informasi pelanggan, nama makanan,
 * harga satuan, dan jumlah pesanan.
 *
 * @author Fajar Putra Pratama
 */
public class FoodOrder {

    private String customerName;
    private String foodName;
    private int price;
    private int quantity;

    /**
     * Membuat objek pesanan makanan baru.
     *
     * @param customerName nama pelanggan
     * @param foodName nama makanan yang dipesan
     * @param price harga satuan makanan
     * @param quantity jumlah makanan yang dipesan
     * @throws IllegalArgumentException jika data pesanan tidak valid
     */
    public FoodOrder(String customerName, String foodName,
                     int price, int quantity) {

        // Validasi nama pelanggan
        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException(
                    "Nama pelanggan tidak boleh kosong.");
        }

        // Validasi nama makanan
        if (foodName == null || foodName.isBlank()) {
            throw new IllegalArgumentException(
                    "Nama makanan tidak boleh kosong.");
        }

        // Validasi harga
        if (price <= 0) {
            throw new IllegalArgumentException(
                    "Harga makanan harus lebih dari 0.");
        }

        // Validasi jumlah
        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Jumlah pesanan harus lebih dari 0.");
        }

        this.customerName = customerName.trim();
        this.foodName = foodName.trim();
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Mengambil nama pelanggan.
     *
     * @return nama pelanggan
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Mengambil nama makanan.
     *
     * @return nama makanan
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Mengambil harga satuan makanan.
     *
     * @return harga satuan makanan
     */
    public int getPrice() {
        return price;
    }

    /**
     * Mengambil jumlah makanan yang dipesan.
     *
     * @return jumlah pesanan
     */
    public int getQuantity() {
        return quantity;
    }
}
