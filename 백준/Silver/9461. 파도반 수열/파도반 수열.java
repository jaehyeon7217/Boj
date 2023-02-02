import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        long[] map = new long[101];

        map[0] = 1L;
        map[1] = 1L;
        map[2] = 1L;

        for(int T = 0; T<t ; T++){
            int temp = Integer.parseInt(br.readLine())-1;


            if(map[temp] == 0L){
                for(int i=3; i<=temp; i++){
                    if(map[i] != 0) continue;

                    map[i] = map[i-3] + map[i-2];

                }
            }

            sb.append(map[temp] + "\n");
        }

        System.out.println(sb.toString());
    }
}
