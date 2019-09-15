import java.util.Arrays;
import java.util.Scanner;
public class Maine {
    public static void main(String[]args){
        int n,k,t;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        k=reader.nextInt();
        int[]a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=reader.nextInt();
        }
        Arrays.sort(a);
        t=a[n-1];
        if(t>k)
            System.out.println(t-1+t-k);
        else
            System.out.println(k-1);
    }
}
