import java.util.Scanner;
public class Mainh {
    public static void main(String[]args){
        int t,i,k,count=0;
        double sum;
        Scanner reader=new Scanner(System.in);
        t=reader.nextInt();
        for(i=1;i<=t;i++)
        {
            sum=Math.sqrt(i);
            k=(int)sum;
            if(k==sum) {
                count++;
            }
        }
        System.out.println(count);
    }
}
