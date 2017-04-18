import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] array = new int[n];
    for(int i = 0 ; i < n ; i++)
      array[i] = sc.nextInt();
    int bCharged = sc.nextInt();
    int sum = Arrays.stream(array).sum();
    int bActual = (sum - array[k]) / 2;
    if(bCharged <= bActual)
      System.out.println("Bon Appetit");
    else
      System.out.println(bCharged - bActual);
  }
}
