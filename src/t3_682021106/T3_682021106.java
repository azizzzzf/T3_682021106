/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3_682021106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author O M E N
 */
public class T3_682021106 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        int harga[] = new int [100];
        String menu[] = new String [100];
        int m = 0, total = 0, jumlah = 0, diskon = 0, pilih; //m = variabel menu
        String keputusan="Ya";
        String nama;
        System.out.println("                Selamat Datang di Resto Semarang");
        System.out.println("    Dapatkan diskon senilai 20% untuk pembelian minimal 50K");
        System.out.println("                         ************");
        System.out.println("");
        System.out.println("");
        //=====================================================================================
        //name section
        System.out.print("Silahkan masukkan nama anda: ");
        nama = input.next();
        //=====================================================================================
        //menu section
        System.out.println("Daftar Menu Resto Semarang: ");
        System.out.println("---------------------------------------- ");
        System.out.println("1. Ayam Bakar Madu          = Rp 30.000");
        System.out.println("2. Ayam Sambal Penyet       = Rp 24.700");
        System.out.println("3. Sayur Bening             = Rp 10.000");
        System.out.println("4. Es Teh Manis             = Rp 5000");
        System.out.println("5. Jus Alpukat              = Rp 10.000");
        System.out.println("6. Nasi Hangat              = Rp 5000");
        System.out.println("7. Chicken Crispy           = Rp 13.000");
        System.out.println("8. Salad with Mayo          = Rp 14.399");
        System.out.println("9. Caramelized Butter Praws = Rp 41.000");
        System.out.println("10. Gulai Kepala Ikan       = Rp 33.000");
        System.out.println("11. Bulgogi                 = Rp 61.000");

        System.out.println("");
        //==========================================================================================
        //input pilihan & menu section
        while (keputusan.equals("Ya")||keputusan.equals("ya"))
        {
        System.out.print("Inputkan pilihan menu anda : ");
        pilih = input.nextInt();
        System.out.print("Jumlah menu yang anda pilih: ");
        jumlah = input.nextInt();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Resroran Semarang");
        System.out.println("Jl. Gajahamada No.125");
        System.out.println("----------------------------------");
        //==========================================================================================
        //date & time section
        Date thisDate = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY HH:mm:ss a");
        System.out.println(nama + "                           " + dateForm.format(thisDate));
        //==========================================================================================
        //menu option section
        if(pilih==1){
            menu[m] = "Ayam Bakar Madu";
            harga[m] = 30000;
        } else if(pilih==2) {
            menu[m] = "Ayam Sambal Penyet";
            harga[m] = 24700;
        } else if(pilih==3) {
            menu[m] = "Sayur Bening";
            harga[m] = 10000;
        } else if(pilih==4) {
            menu[m] = "Es Teh Manis";
            harga[m] = 5000;
        } else if(pilih==5) {
            menu[m] = "Jus Alpukat";
            harga[m] = 10000;
        } else if(pilih==6) {
            menu[m] = "Nasi Hangat";
            harga[m] = 5000;
        } else if(pilih==7) {
            menu[m] = "Chicken Crispy";
            harga[m] = 13000;
        } else if(pilih==8) {
            menu[m] = "Salad with Mayo";
            harga[m] = 14399;
        } else if(pilih==9) {
            menu[m] = "Caramalized Butter Prawns";
            harga[m] = 41000;
        } else if(pilih==10) {
            menu[m] = "Gulai Kepala Ikan";
            harga[m] = 33000;
        } else if(pilih==11) {
            menu[m] = "Bulgogi";
            harga[m] = 61000;
        } else {
            System.out.println("Maaf pesanan yang anda pilih tidak terdapat dalam menu");
            menu[m]= "Tidak terdaftar dalam menu";       
        }
            //total and final price section
            System.out.println("Menu yang anda pesan                 : "+ menu[m]);
            System.out.println("Tagihan yang harus dibayar           : "+ harga[m]);
            System.out.println("Jumlah yang anda pesan               : "+ jumlah);
            System.out.print("Tambahkan pesanan lain? Ya/Tidak: ");
            try{ //exception line
                keputusan = input2.readLine();
            }catch(IOException e){
                 System.out.println("Tidak terbaca");
            }
            m++;
        }
        System.out.println("");
        System.out.println("Menu yang anda pesan                 : "+m);
        for (int a = 0; a<m;a++){
            System.out.print(menu[a]+", ");
        }
        //total harga
        System.out.println("");
        for (int p = 0; p<m;p++){
            total = total + harga[p]; //total = 0 + harga                                                  
        }
        if(total*jumlah>=50000) {
            diskon = total*jumlah*20/100;
        }
        System.out.println("Total tagihan                        : Rp."+total*jumlah);
        System.out.println("Diskon                               : Rp."+diskon);
        System.out.println("Total yang harus anda bayar adalah   : Rp."+ (total*jumlah-diskon));
        System.out.println("");
        System.out.println("                   Terima kasih telah berkunjung");
        System.out.println("                           ************");
    }
    
}
