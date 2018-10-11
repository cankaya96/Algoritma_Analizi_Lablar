/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_Hazırlık;

/**
 *
 * @author M. Furkan Çankaya
 */
public class Cozum2 {
    static int sayac=0;
     public static void main(String[] args) {
      int nDisks = 20;
      
        Stopwatch timer = new Stopwatch();
      doTowers(nDisks, 'A', 'B', 'C');
         System.out.println("Kaç Adımda Çözüldü: "+sayac);
         StdOut.println("elapsed time = " + timer.elapsedTime());
   }
   public static void doTowers(int topN, char from, char inter, char to) {
      sayac++;
       if (topN == 1) {
         System.out.println("Disk 1 from " + from + " to " + to);
      } else {
         doTowers(topN - 1, from, to, inter);
         System.out.println("Disk " + topN + " from " + from + " to " + to);
         doTowers(topN - 1, inter, from, to);
      }
   }
}
