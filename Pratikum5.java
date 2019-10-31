/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.io.*;
public class Pratikum5 {
    protected double radius;
 public Pratikum5(double radius){
     this.radius=radius;
 }  
  public void Luas(){ 
      double luas = 3.14*radius*radius;
      System.out.println("Luas lingkaran: "+luas);
  }
    
  public void Keliling(){ 
      double keliling = 3.14*radius*radius;
      System.out.println("Keliling lingkaran: "+keliling);
  }  
    
    public static void main(String[] args)throws Exception {
       DataInputStream dis= new DataInputStream(System.in);
       System.out.print("input radius: ");
       String input = dis.readLine();
       double i= Double.parseDouble(input);
      Pratikum5 A = new Pratikum5(i);
      A.Luas();
      A.Keliling();
    }
    
}
