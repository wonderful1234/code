import java.util.Scanner;//判断奇偶

public class Maina {
    public static void main(String[]args){
        int n,i,b;
        char c;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        String[]a=new String[n];
        for(i=0;i<a.length;i++)
            a[i]=reader.next();
        for (i = 0; i <a.length ; i++) {
            b=a[i].length()-1;
            c=a[i].charAt(b);
            if((c-'0')%2==0)
                System.out.println("even");
            else
                System.out.println("odd");
        }

    }
}
