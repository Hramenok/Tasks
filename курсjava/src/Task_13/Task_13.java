package Task_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_13 {

    public static void main(String[] args) throws IOException {
        String str1;
        String str2;
        BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
        str1=buf.readLine();
        str2=buf.readLine();
        String res=str1.length()>=str2.length()?str1:str2;
        System.out.println(res);

    }
}
