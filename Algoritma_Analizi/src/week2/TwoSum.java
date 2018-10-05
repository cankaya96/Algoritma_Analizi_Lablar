package week2;

import java.util.Arrays;

public class TwoSum {
static int sayacSort = 0;
TwoSum ts=new TwoSum();

    // print distinct pairs (i, j) such that a[i] + a[j]  = 0
  /*  public static void printAll(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] + a[j] == 0) {
                	StdOut.println(a[i] + " " + a[j]);
                }
            }
        }
    } */

    // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
 public void quickSort(int A[],int pivot, int r)
{
    sayacSort++;
    int q;
    if(pivot<r)
    {
        q=partition(A,pivot, r);
        quickSort(A,pivot, q-1);
        quickSort(A,q+1, r);
    }
}
 private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] == a[i-1]) return true;
        return false;
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
    public static int count(int[] dizi) {
        
        
        containsDuplicates(dizi);
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
                // System.out.println(dizi[sayac]+"  "+dizi[middle]);
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
        partition(dizi,0,dizi.length-1);
        
        return sayacSort;
    } 
 public static void printAll(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        for (int i = 0; i < n; i++) {
            int j = Arrays.binarySearch(a, -a[i]);
            if (j > i) StdOut.println(a[i] + " " + a[j]);
        }
    } 

} 
