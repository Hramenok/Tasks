package Task_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_12 {

    public static void main(String[] args) throws IOException {
        String res;
        BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
        res=buf.readLine();
        System.out.println(res.replaceAll(" ",""));
    }
}
