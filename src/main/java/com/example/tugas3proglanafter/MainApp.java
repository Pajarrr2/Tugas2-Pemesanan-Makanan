
package com.example.tugas3proglanafter;

public class MainApp {

    public static void main(String[] args) {

        OrderService service = new OrderService();

        // Pengujian 1: Pesanan valid
        System.out.println("=== PENGUJIAN 1: PESANAN VALID ===");

        try {
            FoodOrder order = new FoodOrder(
                    "Fajar",
                    "Nasi Goreng",
                    15000,
                    2
            );

            service.processOrder(order);

        } catch (IllegalArgumentException e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }

        // Pengujian 2: Nama pelanggan kosong
        System.out.println("\n=== PENGUJIAN 2: NAMA KOSONG ===");

        try {
            FoodOrder order = new FoodOrder(
                    "",
                    "Nasi Goreng",
                    15000,
                    2
            );

            service.processOrder(order);

        } catch (IllegalArgumentException e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }

        // Pengujian 3: Harga tidak valid
        System.out.println("\n=== PENGUJIAN 3: HARGA NEGATIF ===");

        try {
            FoodOrder order = new FoodOrder(
                    "Fajar",
                    "Nasi Goreng",
                    -15000,
                    2
            );

            service.processOrder(order);

        } catch (IllegalArgumentException e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }

        // Pengujian 4: Jumlah tidak valid
        System.out.println("\n=== PENGUJIAN 4: JUMLAH NOL ===");

        try {
            FoodOrder order = new FoodOrder(
                    "Fajar",
                    "Nasi Goreng",
                    15000,
                    0
            );

            service.processOrder(order);

        } catch (IllegalArgumentException e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }

        // Pengujian 5: Objek pesanan null
        System.out.println("\n=== PENGUJIAN 5: PESANAN NULL ===");

        try {
            service.processOrder(null);

        } catch (IllegalArgumentException e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }
    }
}
