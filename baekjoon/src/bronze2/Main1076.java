package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

class p1076 {
    static HashMap<String, String> colors;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        colors = new HashMap<String, String>();
        getColors();

        // 첫 번째 색
        String firstColor = br.readLine();
        String secondColor = br.readLine();
        String lastColor = br.readLine();
        String resistanceStr = colors.get(firstColor).split("_")[0] + colors.get(secondColor).split("_")[0];
        long resist = Long.valueOf(resistanceStr) * Long.valueOf(colors.get(lastColor).split("_")[1]);

        System.out.println(resist);
    }

    static void getColors()	{
        colors.put("black", "0_1");
        colors.put("brown", "1_10");
        colors.put("red", "2_100");
        colors.put("orange", "3_1000");
        colors.put("yellow", "4_10000");
        colors.put("green", "5_100000");
        colors.put("blue", "6_1000000");
        colors.put("violet", "7_10000000");
        colors.put("grey", "8_100000000");
        colors.put("white", "9_1000000000");
    }
}
public class Main1076 {
    public static void main(String[] args) {
        String[] color = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        Scanner scanner = new Scanner(System.in);
//        String v1 = scanner.next();
//        String v2 = scanner.next();
//        String x = scanner.next();
        String v1 = "white";
        String v2 = "white";
        String x = "white";


        long a =0;
        long b =0;
        long c =0;
        for (int i = 0; i < 10; i++) {
            if (v1.equals(color[i]))
                a=i;
        }
        for (int i = 0; i < 10; i++) {
            if (v2.equals(color[i]))
                b=i;

        }
        for (int i = 0; i < 10; i++) {

            if (x.equals(color[i]))
                c= (int) Math.pow(10,i);
        }
        System.out.println((a*10+b)*c);

    }
}
