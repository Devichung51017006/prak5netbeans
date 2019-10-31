/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;
import java.util.Scanner;
public class Aksi {
    public static void main(String args[]){
        String NIK,Nama,JenisKelamin;
        int Umur;
        String NIM,Fakultas,Jurusan;
        double tugas1,tugas2,tugas3;
        double UTS, UAS;
        double hasil;
        
        Mahasiswa MHS = new Mahasiswa();
        Scanner SC = new Scanner (System.in);
        
        System.out.print("Masukkan NIK :");
        NIK = SC.nextLine();
        System.out.print("Masukkan Nama Anda :");
        Nama = SC.nextLine();
        System.out.print("Masukkan Jenis Kelamin :");
        JenisKelamin = SC.nextLine();
        System.out.print("Masukkan Umur :");
        Umur = SC.nextInt();
        System.out.print("Masukkan NIM :");
        NIM = SC.nextLine();
        System.out.print("Masukkan Fakultas :");
        Fakultas = SC.nextLine();
        System.out.print("Masukkan Jurusan :");
        Jurusan = SC.nextLine();
        System.out.print("Masukkan TGS1 :");
        tugas1 = SC.nextDouble();
        System.out.print("Masukkan TGS2 :");
        tugas2 = SC.nextDouble();
        System.out.print("Masukkan TGS3 :");
        tugas3 = SC.nextDouble();
        System.out.print("Masukkan UTS :");
        UTS = SC.nextDouble();
        System.out.print("Masukkan UAS :");
        UAS = SC.nextDouble();
        
        MHS.identitas(NIK,Nama,JenisKelamin,Umur);
        MHS.dataMahasiswa(NIM, Fakultas,Jurusan);
        MHS.nilaiMahasiswa(tugas1,tugas2,tugas3,UTS,UAS);
    }
}
