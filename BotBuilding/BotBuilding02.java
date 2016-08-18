import java.io.*;
import java.util.*;

public class BotBuiling02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();    
        
        int[] princess = new int[2];
        int[] bot = new int[2];
        bot[0] = in.nextInt();
        bot[1] = in.nextInt();
        in.nextLine();
        
        String[] square = new String[n];
        for(int i = 0 ; i < n ; i++) {
            square[i] = in.nextLine();
            // System.out.println(square[i]);
            
            for(int j = 0 ; j < n ; j++) {
             char check = square[i].charAt(j);
                if(check == 'p') {
                    princess[0] = i;
                    princess[1] = j;
                }
            }
        }
        
        int upDown = princess[0] - bot[0];
        String move;
        if(upDown < 0) {
            move = "UP";
        } else if(upDown > 0) {
            move = "DOWN";
        } else {
            int leftRight = princess[1] - bot[1];
            if(leftRight < 0) {
                move = "LEFT";
            } else {
                move = "RIGHT";
            }
        }
        System.out.println(move);
        
    }
}
