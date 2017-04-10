import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int[] getRecord(int[] s){
    int min = s[0];
    int max = s[0];
    int breakMin = 0;
    int breakMax = 0;
    
    for(int i = 1 ; i < s.length ; i++)
    {
      if(s[i] < min)
      {
        min = s[i];
        breakMin++;
      }
      if(s[i] > max)
      {
        max = s[i];
        breakMax++;
      }
    }
    int[] a = new int[2];
    a[0] = breakMax;
    a[1] = breakMin;
    return a;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] s = new int[n];
    for(int s_i=0; s_i < n; s_i++){
      s[s_i] = in.nextInt();
    }
    int[] result = getRecord(s);
    String separator = "", delimiter = " ";
    for (Integer val : result) {
      System.out.print(separator + val);
      separator = delimiter;
    }
    System.out.println("");
  }
}
