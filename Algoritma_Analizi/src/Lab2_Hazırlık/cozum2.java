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
public class cozum2 {
    public static void main(String[] args) {
        int [] dizi={-34,68,798,-987,-789,6598,-6598,12354,9875612,-9875612,-12354};
        quickSort(dizi, 0, dizi.length-1);
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+"  ");
        }
        
        int first=0;
        int sayac=0;
        int search;
        int last=dizi.length-1;
        int middle=(first+last)/2;
        while(dizi[sayac]<0){
            search=dizi[sayac]*(-1);
            while(first<= last){
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
    }
    
     public static void quickSort(int A[],int pivot, int r)
{
    int q;
    if(pivot<r)
    {
        q=partition(A,pivot, r);
        quickSort(A,pivot, q-1);
        quickSort(A,q+1, r);
    }
}
     public static int partition(int A[],int pivot, int r){
    int tmp;
    int x = A[r];
    int i = pivot-1;

    for(int j=pivot; j<=r-1; j++)
    {
        if(A[j]<=x)
        {
            i++;
            tmp=A[i];
            A[i]=A[j];
            A[j]=tmp;
        }
    }
    tmp=A[i+1];
    A[i+1]=A[r];
    A[r]=tmp;
    return i+1;
}
}
