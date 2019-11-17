import java.util.Arrays;     // 求排序后的数组在原数组中的位置
import java.util.Scanner;     //比较菜，拷贝了一份原数组

public class Mainj {
    public static void main(String[]args){
        int i,count,a,h;
        double b;
        String c;
        char c1,c2;
        Scanner reader=new Scanner(System.in);
        count=reader.nextInt();
        int[]s1=new int[count];
        double[]s2=new double[26];
        double[]s3=new double[26];
        double[]s4=new double[26];
        for(i=0;i<count;i++)
        {
            c=reader.next();
            c1=c.charAt(0);
            a=s1[c1-65]=reader.nextInt();
            b=s2[c1-65]=reader.nextDouble();
            s3[c1-65]=s3[c1-65]+a*b;
        }
        s4=s3.clone();
        Arrays.sort(s3);
        for (i=s3.length-1;i>=0;i--) {
            for (h=0;h<s4.length;h++){
                if(s3[i]==s4[h]&&s3[i]!=0){
                    c2=(char)(h+65);
                    System.out.print(c2+" ");
                    System.out.printf("%.2f\n",s3[i]);
                }
            }

        }
    }
}
