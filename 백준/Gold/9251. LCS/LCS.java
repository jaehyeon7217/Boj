import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

        int[][] map = new int[a.length+1][b.length+1];


        for(int i=1;i<=a.length;i++){
            for(int j=1;j<=b.length;j++){
                if(a[i-1] == b[j-1])
                    map[i][j] = map[i - 1][j - 1] + 1;

                else
                    map[i][j] = Math.max(map[i-1][j],map[i][j-1]);
            }
        }

        System.out.println(map[a.length][b.length]);

    }

}
