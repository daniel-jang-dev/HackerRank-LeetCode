import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    ArrayList list = new ArrayList<>();
    Map map = new TreeMap();
    for(int i = 0 ; i < n ; i++)
    {
      int x = scanner.nextInt();
      list.add(x);
      sum += x;
      if(map.containsKey(x))
      {
        int v = (int)map.get(x);
        map.put(x, v + 1);
      }
      else
      {
        map.put(x, 1);
      }
    }  
    // mean
    double mean = (double)sum / n;
    
    // median
    Collections.sort(list);
    double median = 0.0;
    if(n % 2 == 0)
    {
      median = (double)((int)list.get(n/2 - 1) + (int)list.get(n/2)) / 2;
    }
    else
    {
      median = (double)list.get((n-1)/2);
    }
    
    // mode
    int max = 0;
    int mode = 0;
    for(Object k : map.keySet()) 
    {
      int v = (int)map.get(k);
      if(v > max)
      {
        max = v;
        mode = (int)k;
      }
    }
    
    // output
    System.out.printf("%.1f%n", mean);
    System.out.printf("%.1f%n", median);
    System.out.println(mode);
  }
}
