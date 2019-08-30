import java.util.Scanner;

public class Mainb {
    public static void main(String[]args) {
        int i, sum = 0, end = 0;
        int[] a = new int[12];
        Scanner reader = new Scanner(System.in);
        for (i = 0; i < a.length; i++)
            a[i] = reader.nextInt();
        for (i = 0; i < a.length; i++) {
            sum += 300;
            sum = sum - a[i];
            if (sum < 0) {
                System.out.println(-(i + 1));
                break;
            }
            if (sum >= 100) {
                end += sum / 100;
                sum %= 100;
            }
        }
        if(sum>0)
            System.out.println(sum+(int)(end*100*1.2));
    }
}
