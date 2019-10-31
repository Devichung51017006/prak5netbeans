/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

public class Mahasiswa extends Manusia{
    private double hasil;
    
    void dataMahasiswa(String NIM, String Fakultas, String Jurusan){
        System.out.println("NIM     : "+NIM);
        System.out.println("Fakultas: "+ Fakultas);
        System.out.println("Jurusan : "+Jurusan);
    }
    void nilaiMahasiswa(double tugas1, double tugas2, double tugas3, double UTS, double UAS){
        hasil =((tugas1+tugas2+tugas3)* 0.4 + UTS * 0.3 + UAS * 0.3);
        System.out.println("Nilai Akhir: "+hasil);
    }
}
