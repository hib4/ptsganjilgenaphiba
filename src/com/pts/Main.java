package com.pts;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Berapa jumlah siswa yang akan ditambahkan : ");

        int data = scan.nextInt();
        int dataSiswa = 1;

        String[] namaSiswa = new String[data];

        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.print("Masukkan nama siswa ke " + (dataSiswa + i) + " : ");

            namaSiswa[i] = scan.next() + scan.nextLine();
        }

        System.out.println(" ");
        System.out.println("DAFTAR SISWA YANG DIPILIH");
        System.out.println(" ");

        for (int i = 0; i < namaSiswa.length; i++) {
            Arrays.sort(namaSiswa);
            String urutan = namaSiswa[i];
            System.out.println((dataSiswa + i) + ". " + urutan.toUpperCase());
        }
    }
}