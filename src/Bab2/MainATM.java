package Bab2;
import java.util.Scanner;

public class MainATM{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    int pilih;
    int pilihBank;
    int nominal = 0;
    String ulang;
    String nmBank = "";
    String noRekening = "";
    
    System.out.println("==================================================");
    System.out.println("=====      Selamat Datang di BANK PTI A      =====");
    System.out.println("== ATM ini Menggunakan Uang Pecahan Rp 50.000,- ==");
    System.out.println("==================================================");

    ATM PTI = new ATM();    //instansiasi objek class atm

    PTI.cekPasword();

    int i = 0;
    do{
    System.out.println("--- Pilihan Menu ---");
    System.out.println("1. Informasi Saldo");
    System.out.println("2. Penarikan");
    System.out.println("3. Transfer");
    System.out.println("4. Keluar");

    System.out.print("Masukkan Pilihan Anda      : ");
    pilih = input.nextInt();

    if (pilih == 1)
        PTI.cekSaldo();
    else if (pilih == 2)
        PTI.penarikan();
    else if (pilih == 3){
        System.out.println("--- Pilih Bank ---");
        System.out.println("1. Bank yang Sama");
        System.out.println("2. Bank yang Berbeda");
        System.out.print("Masukkan Pilihan Anda : ");
        pilihBank = input.nextInt();
            if (pilihBank == 1){
                PTI.transfer(noRekening, nominal);
            } if (pilihBank == 2){
                PTI.transfer(noRekening, nominal, nmBank);
            } else {
                System.out.println("Maaf Inputan Tidak Benar");
            }     
    }
    
    else if (pilih == 4){
        System.out.println("Terimakasih atas Kunjungan Anda");
        break;
    }
    else{
        System.out.println("Maaf Menu Tidak Tersedia");
    }
    
    System.out.print("Apakah Anda ingin Bertransaksi Lagi [y/t] : ");
    ulang = input.next();
    i++;
    }
    
    while (ulang.equals("y") || ulang.equals("Y"));
        System.out.println("Created by : Albert Wirawan");
    }
}
