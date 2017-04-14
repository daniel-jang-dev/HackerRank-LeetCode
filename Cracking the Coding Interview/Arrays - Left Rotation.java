[Array: Left Rotation](https://www.hackerrank.com/challenges/ctci-array-left-rotation)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    for(int i=0; i < n; i++){
      a[i] = in.nextInt();
      if(i < k)
        b[n-k+i] = a[i];
      else
        b[i-k] = a[i];
    }
    for(int i = 0 ; i < b.length ; i++)
    {
      System.out.print(b[i] + " ");
    }
      
  }
}
