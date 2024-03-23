import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0 ;i<n;i++){
            String s = br.readLine().toLowerCase();
            sb.append(s + "\n");
        }

        System.out.println(sb.toString());

    }


}