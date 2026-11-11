
package com.example.tugas3proglanafter;

/**
 * Menangani proses pemesanan makanan, perhitungan total harga,
 * pemberian diskon, dan penampilan nota pesanan.
 *
 * @author Fajar Putra Pratama
 */
public class OrderService {

    /** Batas minimum total pesanan untuk mendapatkan diskon. */
    public static final int MINIMUM_DISCOUNT_ORDER = 25000;

    /** Persentase diskon yang diberikan kepada pelanggan. */
    public static final double DISCOUNT_RATE = 0.10;

    /**
     * Memproses pesanan dan menampilkan rincian pembayaran.
     *
     * @param order objek pesanan yang akan diproses
     * @throws IllegalArgumentException jika objek pesanan null
     */
    public void processOrder(FoodOrder order) {

        // Validasi objek pesanan
        if (order == null) {
            throw new IllegalArgumentException(
                    "Pesanan tidak boleh null.");
        }

        System.out.println("=== SISTEM PEMESANAN MAKANAN ===");
        System.out.println("Nama Pelanggan: " + order.getCustomerName());
        System.out.println("Nama Makanan: " + order.getFoodName());
        System.out.println("Harga: Rp" + order.getPrice());
        System.out.println("Jumlah: " + order.getQuantity());

        int totalPrice = order.getPrice() * order.getQuantity();

        System.out.println("Total Harga: Rp" + totalPrice);

        double discount = calculateDiscount(totalPrice);

        System.out.println("Diskon: Rp" + discount);
        System.out.println(
                "Total Pembayaran: Rp" + (totalPrice - discount));
    }

    /**
     * Menghitung diskon berdasarkan total harga pesanan.
     * Diskon diberikan jika total harga mencapai batas minimum.
     *
     * @param total total harga sebelum diskon
     * @return jumlah diskon yang diperoleh pelanggan
     */
    private double calculateDiscount(int total) {
        double discount = 0;

        if (total >= MINIMUM_DISCOUNT_ORDER) {
            discount = total * DISCOUNT_RATE;
        }

        return discount;
    }
}
