/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author M. Furkan Çankaya
 */
public class gcd_computer {
    
    
    
     public static void ebob1_Oklid(int buyuk, int kucuk){
        int tempK=0;
        int counter=0;
        while(kucuk!=0){
            tempK=buyuk%kucuk;
            buyuk=kucuk;
            kucuk=tempK;
            counter++;
        }
        System.out.println("öklid sonucu: " + buyuk + " öklid counter: "+ counter);
        
    }
    public static void ebob2(int buyuk, int kucuk){
        int tempK=kucuk;
        int counter=0;
        while(!((buyuk%tempK==0) && (kucuk%tempK==0) ) ){
            tempK=tempK-1;
            counter++;
        }
        System.out.println("ebob2 sonucu: "+ tempK + " ebob2 counter: "+ counter);
    }
}
