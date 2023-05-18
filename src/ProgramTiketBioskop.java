/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FRHN
 */
import java.util.Scanner;

public class ProgramTiketBioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Daftar film yang tersedia
        String[] daftarFilm = {
            "FAST X",
            "GUARDIANS OF THE GALAXY VOL. 3",
            "EVIL DEAD RISE",
            "HELLO GHOST",
            "SEWU DINO",
            "BORN TO FLY",
            "KAJIMAN"
        };
        
        // Harga tiket bioskop
        int hargaTiket = 50000;
        
        // Menampilkan daftar film yang tersedia
        System.out.println("Daftar Film:");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i+1) + ". " + daftarFilm[i]);
        }
        
        // Meminta pengguna memilih film
        System.out.print("Pilih nomor film yang ingin ditonton: ");
        int nomorFilm = scanner.nextInt();
        
        // Validasi nomor film yang dipilih
        if (nomorFilm < 1 || nomorFilm > daftarFilm.length) {
            System.out.println("Nomor film tidak valid.");
            scanner.close();
            return;
        }
        
        // Meminta pengguna memasukkan jumlah tiket yang dibeli
        System.out.print("Jumlah tiket yang dibeli: ");
        int jumlahTiket = scanner.nextInt();
        
        // Menghitung total harga tiket
        int totalHarga = hargaTiket * jumlahTiket;
        
        // Menampilkan tiket yang dibeli
        System.out.println("\nTiket yang Dibeli:");
        System.out.println("Film: " + daftarFilm[nomorFilm-1]);
        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga: " + totalHarga);
        
        scanner.close();
    }
}
