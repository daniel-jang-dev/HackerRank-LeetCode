import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    
    LinkedList<Integer> list = new LinkedList<>();
    
    while(q > 0)
    {
      int type = in.nextInt();
      switch(type){
        case 1:
          int x = in.nextInt();
          list.addLast(x);
        break;
        case 2:
          list.removeFirst();
        break;
        case 3:
          System.out.println(list.get(0));
        break;
      }
      q--;
    }
  }
}

