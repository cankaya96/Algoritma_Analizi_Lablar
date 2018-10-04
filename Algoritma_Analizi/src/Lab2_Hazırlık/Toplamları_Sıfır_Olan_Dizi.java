/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_Hazırlık;

/**
 *
 * @author M. Furkan Çankaya
 */
public class Toplamları_Sıfır_Olan_Dizi {
    public static void main(String[] args) {
        int SayaçSıralama=0;
        int sayaçBinary=0;
        int [] dizi={-34,68,798,-987,-789,6598,-6598,12354,9875612,-9875612,-12354};
        int temp;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if(dizi[i]<dizi[j]){
                    temp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                    SayaçSıralama++;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");
        int first=0;
        int sayac=0;
        int search;
        int last=dizi.length-1;
        int middle=(first+last)/2;
        while(dizi[sayac]<0){
            search=dizi[sayac]*(-1);
            while(first<= last){
                sayaçBinary++;
             if(dizi[middle]<search){
                 first = middle + 1;
             }
             else if(dizi[middle]==(search)){
                 System.out.println(dizi[sayac]+"  "+dizi[middle]);
                 break;
             }
             else{
                 last = middle-1;
             }
             middle=(first+last)/2;
            }
            if(first>last){
                break;
            }
            sayac++;
            first=sayac;
        }
        
        System.out.println("Sıralama adımları: "+SayaçSıralama);
        System.out.println("Binary Adımları: "+sayaçBinary);
    }
}
