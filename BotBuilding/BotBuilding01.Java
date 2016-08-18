import java.io.*;
import java.util.*;

public class BotBuiling01 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        int[] princess = new int[2];
        int[] bot = new int[2];
        String[] square = new String[n];
        for(int i = 0 ; i < n ; i++) {
            square[i] = in.nextLine();
            // System.out.println(square[i]);
            
            for(int j = 0 ; j < n ; j++) {
             char check = square[i].charAt(j);
                if(check == 'p') {
                    princess[0] = i;
                    princess[1] = j;
                } else if (check == 'm') {
                    bot[0] = i;
                    bot[1] = j;
                }
            }
        }
        int upDown = princess[0] - bot[0];
        String move;
        if(upDown < 0) {
            upDown = -upDown;
            move = "UP";
        } else {
            move ="DOWN";
        }
        for(int i = 0 ; i < upDown ; i++) {
            System.out.println(move);
        }
        int leftRight = princess[1] - bot[1];
        if(leftRight < 0) {
            leftRight = -leftRight;
            move = "LEFT";
        } else {
            move = "RIGHT";
        }
        for(int i = 0 ; i < leftRight ; i++) {
            System.out.println(move);
        }
    }
}
