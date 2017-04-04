import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            list.add(scan.nextInt());
        }
        int t = scan.nextInt();
        for(int i = 0 ; i < t ; i++) {

            String query = scan.next();
            if(query.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        for(Object x: list) {
            System.out.print((int)x + " ");
        }

    }
}
