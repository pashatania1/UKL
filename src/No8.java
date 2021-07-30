
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pashatania
 */
public class No8 {
    static int hitung(int gol, int jumlah){
        int hasil = 0;
        if(gol == 1 ){
            hasil = jumlah * 1000;
        }
        else if(gol == 2 ){
            hasil = jumlah * 1300;
        }
        else if(gol == 3 ){
            hasil = jumlah * 1500;
        }
        else {
            System.out.println("Salah input golongan");
        }
        
        if(hasil < 50000) {
            hasil = 50000;
        }
        
        int hasilakhir = hasil + 13000;
        
        return hasilakhir;
    }
    
    public static void main(String[] args) {
        int IDPelanggan[] = {1, 2, 3, 4};
        String namaPelanggan[] = {"Galuh", "Indro", "Jedi", "Kanu"};
        int golPelanggan[] = {1, 3, 2, 3}; 
        String alamatPelanggan[] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        
        System.out.println("Inputkan ID Pelanggan :");
        Scanner inputID = new Scanner(System.in);
        String ID = inputID.nextLine();
        System.out.println("Inputkan Jumlah pemakaian kwh :");
        Scanner inputJumlah = new Scanner(System.in);
        String jumlah = inputJumlah.nextLine();
        
        int a = Integer.valueOf(ID); //idPelanggan
        int b = Integer.valueOf(jumlah); //jumlah kwh
        int tagihan = hitung(golPelanggan[a-1], b);
        
        System.out.println("ID Pelanggan: " + a);
        System.out.println("Nama Pelanggan: " + namaPelanggan[a-1]);
        System.out.println("Golongan : " + golPelanggan[a-1]);
        System.out.println("Alamat : " + alamatPelanggan[a-1]);
        System.out.println("Jumlah kwh : " + b);
        System.out.println("Tagihan : Rp. " + tagihan);
    }
}
