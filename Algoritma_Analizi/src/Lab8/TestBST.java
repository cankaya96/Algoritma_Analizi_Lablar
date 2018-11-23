package Lab8;

import Lab8.StdOut;

public class TestBST {
    public static void main(String[] args) { 
        String test = "S E A R C H E X A M P L E"; 
        String[] keys = test.split(" "); 
        int n = keys.length; 
        BST<String, Integer> st = new BST<String, Integer>();
        for (int i = 0; i < n; i++) 
            st.put(keys[i], i); 

        StdOut.println("size = " + st.size());
        StdOut.println("min  = " + st.min());
        StdOut.println("max  = " + st.max());
        StdOut.println();


        // print keys in order using allKeys()
        StdOut.println("Testing keys()");
        StdOut.println("--------------------------------");
        for (String s : st.keys()) 
            StdOut.println(s + " " + st.get(s)); 
        StdOut.println();

        // delete the smallest keys
        for (int i = 0; i < st.size() / 2; i++) {
            st.deleteMin();
        }
        
        StdOut.println("After deleting the smallest " + st.size() / 2 + " keys");
        StdOut.println("--------------------------------");
        for (String s : st.keys()) 
            StdOut.println(s + " " + st.get(s)); 
        StdOut.println();
        StdOut.println("size = " + st.size());
        StdOut.println("min  = " + st.min());
        StdOut.println("max  = " + st.max());
        StdOut.println();

        
        // delete the largest keys
        for (int i = 0; i < st.size() / 2; i++) {
            st.deleteMax();
        }
        StdOut.println("After deleting the max " + st.size() / 2 + " keys");
        StdOut.println("--------------------------------");
        for (String s : st.keys()) 
            StdOut.println(s + " " + st.get(s)); 
        StdOut.println();
        StdOut.println("size = " + st.size());
        StdOut.println("min  = " + st.min());
        StdOut.println("max  = " + st.max());
        StdOut.println();
        

        StdOut.println("After adding back the keys");
        StdOut.println("--------------------------------");
        for (int i = 0; i < n; i++) 
            st.put(keys[i], i); 
        for (String s : st.keys()) 
            StdOut.println(s + " " + st.get(s)); 
        StdOut.println();
        StdOut.println("size = " + st.size());
        StdOut.println("min  = " + st.min());
        StdOut.println("max  = " + st.max());
        StdOut.println();
        
        
        

    }
}

