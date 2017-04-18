import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] xs = new int[n];
    int[] ws = new int[n];
    int sumW = 0;
    int sumXW = 0;
    for(int i = 0 ; i < n ; i++)
    {
      xs[i] = scan.nextInt();
    }
    for(int i = 0 ; i < n ; i++)
    {
      ws[i] = scan.nextInt();
      sumW += ws[i];
    }
    
    for(int i = 0 ; i < n ; i++)
    {
      sumXW += xs[i] * ws[i];
    }
    
    double wm = (double) sumXW / sumW;
    System.out.printf("%.1f", wm);
  }
}
