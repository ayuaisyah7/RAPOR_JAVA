/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidiprorpl1;

import java.util.Scanner;

public class RemidiProRPL1 {

   static void nama(){
       System.out.println("Nama : Ayu Aisyah Fatimatu Syahra");}
       
   static void kelas(){
       System.out.println("Kelas : X RPL 3");}
               
   static void absen(){
       System.out.println("Nomor Absen : 06");}
       
   static void tanggalLahir(){
       System.out.println("Tanggal lahir : 16 Agustus 2005");}
               
    public static void main(String[]args){
        Scanner sken = new
        Scanner(System.in);
        
    int tugas1, tugas2,tugas3,nilaiMAT,rataRataMAT;
    boolean keluar = true;
    String ulang;
    
    nama();
    kelas();
    absen();
    tanggalLahir();
    
    System.out.println("\n");
    System.out.println("Nilai Rapor MAT");
    
    System.out.println("Masukkan nilai tugas 1 anda:");
    tugas1 = sken.nextInt();
    
    System.out.println("Masukkan nilai tugas 2 anda:");
    tugas2 = sken.nextInt();
    
    System.out.println("Masukkan nilai tugas 3 anda");
    tugas3 = sken.nextInt();
    
    nilaiMAT = (tugas1+tugas2+tugas3);
    rataRataMAT = (nilaiMAT/3);
    System.out.println("Nilai rapor MAT anda = "+ rataRataMAT);
    
    if(rataRataMAT >= 81){
        System.out.println("Grade anda adalah A");}
    
    if(rataRataMAT >= 75 && rataRataMAT <=81){
        System.out.println("Grade anda adalah B");}
    
    if(rataRataMAT >= 71 && rataRataMAT <=76){
        System.out.println("Grade anda adalah c");}
    
    else{
        System.out.println("Selamat anda naik kelas");}
    
    System.out.println("\n");
    
    while(keluar){
        System.out.println("Apakah anda ingin keluar?");
        System.out.println("Jawab ya atau tidak");
        
        ulang = sken.nextLine();
        
        if(ulang.equalsIgnoreCase("ya")){
            keluar = false;
        }
    }
    
    }
   }
   
   
    
    

