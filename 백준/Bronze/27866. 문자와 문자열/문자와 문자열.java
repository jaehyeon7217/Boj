import java.io.*;
import java.util.*;

public class Main {


    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int m = Integer.parseInt(br.readLine());

        System.out.println(n.toCharArray()[m-1]);

    }
}
