import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Df = new DecimalFormat("00");
        DecimalFormat Df1 = new DecimalFormat("0");
        int second = in.nextInt();
        int secondOne = second % 60;
        int minute = second / 60 % 60;
        int hours = second / 3600 % 24;
        System.out.print(Df1.format(hours) + ":" + Df.format(minute) + ":" + Df.format(secondOne));
    }
}