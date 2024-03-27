/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1;

/**
 *
 * @author HP
 */

/* */ 
class Soal1 {
    public static void main(String[] args) {
        // Membuat objek segitiga1 
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        
        // Mencetak luas dan keliling segitiga1 
        System.out.println("\nSegitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());

        // Membuat objek segitiga2 
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        
        // Mencetak luas dan keliling segitiga2
        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());

        // Membuat objek segitiga3 
        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        
        // Mencetak luas dan keliling segitiga3
        System.out.println("\nSegitiga 3:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}

class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;
    
    // Konstruktor dengan parameter untuk inisialisasi objek segitiga
    Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    // Getter untuk luas segitiga
    double getLuas() {
        return 0.5 * alas * tinggi;
    }
    
    // Getter untuk keliling segitiga
    double getKeliling() {
        return alas + tinggi + sisi;
    }
    
    // Setter untuk alas segitiga
    void setAlas(double alasBaru) {
        alas = alasBaru;
    }
    
    // Setter untuk tinggi segitiga
    void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }
    
    // Setter untuk sisi segitiga
    void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}
