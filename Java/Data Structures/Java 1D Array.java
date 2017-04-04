import java.util.*;

public class Solution {

  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    // Declare array a here
    int[] a = new int[n];
    
    for(int i=0; i < n ; i++) {
      int val = scan.nextInt();
      // Fill array a
      a[i] = val;
    }
    scan.close();
    
    for(int i = 0 ; 1 < a.length l i++) {
      System.out.println(a[i]);
    }
  }
}
