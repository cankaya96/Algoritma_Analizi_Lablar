
package Lab3_Hazırlık;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author M. Furkan Çankaya
 */
public class TowerOfHanoi {

    public static int N;

   //Stack array oluşturup push ve pop işlemlerini buradan yürütürüz.
    public static Stack<Integer>[] tower = new Stack[4];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();
        Stopwatch timer = new Stopwatch();
        // her bir disk için sayı istiyorum ve Towerlara yerleştiriyorum
        System.out.println("Enter number of disks");
        
        int num = scan.nextInt();
        N = num;
        toh(num);
        System.out.println("Kaç adımda çözdü: "+sayac);
        
    }

    
    public static void toh(int n) {
        for (int d = n; d > 0; d--) {
            //belirtilen adette sayıları en küçüğü üstte bırakacak şekilde döngü ile yerleştiriyorum ardışık sayıları.
            tower[1].push(d);
            //Random sayıları gönderip teker teker kontrol ile yerleştirmeyi denedim ama işin içinden çıkamadım.
            /*Random rd = new Random();
            int a=rd.nextInt(10)+1;
            tower[1].push(a);*/
        }
        display();
        move(n, 1, 2, 3);
    }
static int sayac=0;
    // Recursive fonksiyonu burada kullanıyorum diskleri yerleştirmek için.
    public static void move(int n, int a, int b, int c) {
        if (n > 0) {
            // move ile önce a dan başlayıp her bir kulede bir disk bırakıp daha sonra
            // hepsini büyükten küçüğe dizmek için önce a kulesi ile işi bitirip ikinci
            //recursive e geçiyor daha sonra a içinde yine sayılar olacağı için üstteki devreye giriyor
            sayac++;
            move(n - 1, a, c, b);
            int d = tower[a].pop();
            tower[c].push(d);
            display();
            move(n - 1, b, a, c);
        }
    }

    // tabloların oluşması için düzen ayarları ve verilerin yerleştirilmesi burada yapılıyor.
    //int değerler string olarak yerleştiriliyor.
    public static void display() {
        System.out.println("  A  |  B  |  C");
        System.out.println("---------------");
        
        //bu noktaya kadar 3 sıra için çıktı verdim
        //for döngüsü ile de her sıradaki değeri girdim
        for (int i = N - 1; i >= 0; i--) {
            String d1 = " ", d2 = " ", d3 = " ";
            try {
                d1 = String.valueOf(tower[1].get(i));
            } catch (Exception e) {
            }
            try {
                d2 = String.valueOf(tower[2].get(i));
            } catch (Exception e) {
            }
            try {
                d3 = String.valueOf(tower[3].get(i));
            } catch (Exception e) {
            }
            System.out.println("  " + d1 + "  |  " + d2 + "  |  " + d3);
        }
        System.out.println("\n");
    }

}
