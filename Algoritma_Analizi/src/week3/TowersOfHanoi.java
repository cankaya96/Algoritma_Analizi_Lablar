/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import static Lab3_Hazırlık.Cozum2.doTowers;

/**
 *
 * @author M. Furkan Çankaya
 */
public class TowersOfHanoi {


	   public void solve(int n, String start, String auxiliary, String end) {
	       if (n == 1) {
	           System.out.println("Disk 1 from " + start + " to " + end);
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println("Disk " + n +" from " + start + " to " + end);
	           solve(n - 1, auxiliary, start, end);
	       }
	   }
	   
	   public int solve2(int n, String start, String auxiliary, String end) {
               
               int count=0;
	       if (n == 1) {
                   
         System.out.println("Disk 1 from " + start + " to " + end);
         count++;
      } else {
         count=count+solve2(n - 1, start, end, auxiliary);
         count++;
         System.out.println("Disk " + n + " from " + start + " to " + end);
         count=count+solve2(n - 1, auxiliary, start, end);
      }
	       return count;
	   }
}


