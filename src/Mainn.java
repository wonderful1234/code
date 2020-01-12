import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        int n,m,i,j,k,sum=0,min=Integer.MAX_VALUE;
        Scanner re = new Scanner(System.in);
        n=re.nextInt();
        m=re.nextInt();
        int[]a=new int[n];
        for(i=0;i<a.length;i++){
            a[i]=re.nextInt();
        }
        if(m==n){
            for(i=0;i<a.length;i++){
                sum+=a[i];
            }
            min=sum;
        }
        else {

            for (i = 0; i < n - m; i++) {
                j = 0;
                k = i;
                sum = 0;
                while (j < m) {
                    sum += a[k];
                    k++;
                    j++;
                }
                if (sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println(min);

    }
}
