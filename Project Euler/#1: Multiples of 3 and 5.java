public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      long n = in.nextInt();
      long total = arithmeticSum(n, 3) + arithmeticSum(n, 5) - arithmeticSum(n, 15);
      System.out.println(total);
    }
  }
  
  // return the sum of arithmetic sequence less than N
  
  public static long arithmeticSum(long N, long d) {
    if(N <= d)
      return 0l;
    long n = (N - 1) / d;
    return n * (2 * d + (n - 1) * d) / 2;
  }
}
