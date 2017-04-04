import java.util.*;
class Solution{

  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    List braces = Arrays.asList("{", "[", "(", ")", "]", "}");
    while (sc.hasNext()) {
      Stack stack = new Stack();
      String input = sc.next();     
      for(int i = 0 ; i < input.length() ; i ++)
      {
        String c = input.substring(i, i+1);
        if(stack.empty())
        {
          stack.push(c);
        }
        else
        {
          if(( braces.indexOf(stack.peek()) + braces.indexOf(c) ) == 5)
          {
            stack.pop();
          }
          else
          {
            stack.push(c);
          }
        }
      }
      System.out.println(stack.empty());
    }
  }
}
