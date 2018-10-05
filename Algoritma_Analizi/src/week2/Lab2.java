package week2;

public class Lab2 {

	public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        TwoSum.printAll(a);
        Stopwatch timer = new Stopwatch();
        int count = TwoSum.count(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count); // count of the number of distinct pairs that sum to exactly 0.
        
       //timer = new Stopwatch();
        //int count = TwoSumFast.count(a);
       // StdOut.println("elapsed time = " + timer.elapsedTime());
        //StdOut.println(count); // count of the number of distinct pairs that sum to exactly 0.

	}

}
