package Task_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_9 {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(buf.readLine());
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i] * 2);
        }
    }
}
