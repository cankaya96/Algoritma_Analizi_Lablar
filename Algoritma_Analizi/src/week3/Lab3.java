/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author M. Furkan Çankaya
 */
public class Lab3 {
    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        
        Scanner s =new Scanner(System.in);
        int discs = s.nextInt();
        s.close();
       int count= towersOfHanoi.solve2(discs,"A","B","C");
        System.out.println("count: "+count);
        
    }
}
