/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_Hazırlık;

/**
 *
 * @author M. Furkan Çankaya
 */
public class ebob_cozum1 {
    public static void main(String[] args) {
        int büyük=20;
        int küçük=12;
        ebob1(büyük,küçük);
        ebob2(büyük,küçük);
    }
    
    public static void ebob1(int buyuk, int kucuk){
        int tempK=0;
        while(kucuk!=0){
            tempK=buyuk%kucuk;
            buyuk=kucuk;
            kucuk=tempK;
        }
        System.out.println("ebob1 sonucu: " + buyuk);
    }
    public static void ebob2(int buyuk, int kucuk){
        int tempK=kucuk;
        while(!((buyuk%tempK==0) && (kucuk%tempK==0) ) ){
            tempK=tempK-1;
        }
        System.out.println("ebob2 sonucu: "+ tempK);
    }
}
