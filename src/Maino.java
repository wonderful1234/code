import java.util.Arrays;
import java.util.Scanner;

public class Maino {
    public static void main(String[] args) {
        int n,i,j,count;
        long sum=0;
        Scanner re=new Scanner(System.in);
        n=re.nextInt();
        int[]a=new int[n];
        int[]b=new int[n];
        for(i=0;i<a.length;i++){
            a[i]=re.nextInt();
        }
        for(i=0;i<a.length;i++){
            b[i]=re.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        i=0;
        j=n-1;
        while(i<a.length){
            count=Math.max(0,(b[j]-a[i]));
            sum+=count;
            j--;
            i++;
        }
        System.out.println(sum);
    }
}
