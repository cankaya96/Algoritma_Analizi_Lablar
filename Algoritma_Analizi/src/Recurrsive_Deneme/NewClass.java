/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recurrsive_Deneme;

/**
 *
 * @author M. Furkan Çankaya
 */
public class NewClass {
    public static void main(String[] args) {
        int n=5;
        System.out.println(BinRec(n));
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n<=1) 
            return 1;
        else 
            return (fibonacci(n-1)+ fibonacci(n-2));
    }
    static int BinRec(int n){
        
        if(n==1)
            return 1;
        else return BinRec(n/2)+1;
    }
}
