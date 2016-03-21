package Bab2;
import java.util.Scanner;

class ATM {

    private int firstsaldo = 10000000; //saldo awal 10 juta
    private String nama;
    private int pasword;
    int userinput1;
    int userinput2;
    int penarikan;
    int nomtransfer;
    String rek;
    public int stop = 0;
    
    String namaBank;
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    
    public void ATM(){
        String nm = "PTI";
        int pswd = 1234;
        pasword = pswd;
        nama = nm;
    }

    
    public void cekPasword(){
        int i = 0;
        do{
            System.out.print("Masukkan Password Anda : ");
            userinput1 = input.nextInt();
        if (i > 1){
            System.out.println("Maaf, Transaksi Anda Dibatalkan");
            System.exit(0);
        }
            i++;
    }
        while (userinput1 != pasword);
    }

    public void cekSaldo(){
        System.out.println("Saldo anda sekarang adalah : " + "Rp " + firstsaldo + ",-");
    }

    public int penarikan(){
        int i = 0;
        do{
            System.out.print("Masukkan Nominal Penarikan : ");
            penarikan = input.nextInt();
            if (penarikan > firstsaldo){
                System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
                System.out.println("Silahkan Masukkan Nominal yang Lebih Kecil");
            }       
    
            if (penarikan < 0){
                System.out.println("Maaf, Anda Tidak Memasukkan Nominal yang Benar");
                System.out.println("Silahkan Masukkan Nominal yang Benar");
                penarikan();
            }
    
    else {
        System.out.println("Penarikan Berhasil, Sebanyak : " + "Rp " + penarikan + ",-");
        System.out.println("Terima Kasih^^, Silahkan Ambil Uang Anda ...");
        firstsaldo = firstsaldo - penarikan;
    }
        i++;
    }
        while (penarikan > firstsaldo);
        return firstsaldo;
    }

    public void transfer(String norek, int money){  //method overload (mempunyai 2 parameter)
        rek = norek;
        nomtransfer = money;
        int i = 0;
    do{
        System.out.print("Masukkan Nomor Rekening     : ");
        rek = input2.nextLine();
        System.out.print("Masukkan Nominal Transfer   : ");
        nomtransfer = input.nextInt();
        
        if (nomtransfer > firstsaldo){
            System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
            System.out.println("Silahkan Masukkan Nominal yang Lebih Kecil");
        }
        
        else {
            System.out.println("Transfer Berhasil, Sebesar : " + "Rp " + nomtransfer + ",-");
            
            firstsaldo = firstsaldo - nomtransfer;
        }
            i++;

        }
            while (nomtransfer > firstsaldo);
        }
    
    public void transfer(String norek, int money, String bankname){     //Method Overload (mempunyai 3 parameter)
        rek = norek;
        nomtransfer = money;
        namaBank = bankname;

        int i = 0;
        do{
            System.out.print("Masukkan Nomor Rekening     : ");
            rek = input2.nextLine();
            System.out.print("Masukan Nama Bank           : ");
            bankname = input.next();
            System.out.print("Masukkan Nominal Transfer   : ");
            nomtransfer = input.nextInt();
        
            if (nomtransfer > firstsaldo){
                System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
                System.out.println("Silahkan Masukkan Nominal yang Lebih Kecil");
            }
            
            else {
                System.out.println("Transfer Berhasil, Sebesar : " + "Rp " + nomtransfer + ",-");
                firstsaldo = firstsaldo - nomtransfer;
            }
                i++;
            }
    
            while (nomtransfer > firstsaldo);
    }
}
