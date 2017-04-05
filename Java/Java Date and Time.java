import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

  public static void main(String[] args) {
  
    Scanner in = new Scanner(System.in);
    int month = in.nextInt();
    int day = in.nextInt();
    int year = in.nextInt();
    
    Calendar cal = Calendar.getInstance();
    cal.set(year, month-1, day); // month index starts from 0
    int val = cal.get(Calendar.DAY_OF_WEEK); // number of day
    System.out.println(new DateFormatSymbols().getWeekdays()[val].toUpperCase());
  }
}
