/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;


class persegi extends Bentuk{
protected int p,l;

public void setSuperP(int p) {
    super.p = p;}

public void setSuperL(int l){
    super.l = l;}

public void setP(int p){
    this.p = p;}

public void setL(int l){
    this.l = l;}

public void getLuas(){
System.out.println("Luas super: "+(super.l*super.p));
System.out.println("Luas : "+(this.l*this.p));}
 }

