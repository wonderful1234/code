import java.util.Scanner;

public class Maink {
    public static void main(String[] args) {
        int a=1,b=1,n,i,c=0;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        if(n<=2){
            System.out.println("even");
        }
        else {
            for(i=3;i<=n;i++){
                c=b;
                b=a+b;
                a=c;
            }
            if(b%2==0){
                System.out.println("odd");
            }
            else {
                System.out.println("even");
            }
        }
    }
}
